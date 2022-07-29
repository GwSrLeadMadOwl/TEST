package com.bootcampexcercise.module10.activity5;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ElectronicItemDetails {
        //implementation of HashMap
        static Map<String, Double> map = new HashMap<String, Double>();
        public static void main(String[] args)
        {
            ElectronicItemDetails ei = new ElectronicItemDetails();
            ei.itemHashMap("TV", 400.0);
            ei.itemHashMap("Refrigerator", 700.0);
            ei.itemHashMap("Washing Machine", 600.0);
            ei.itemHashMap("Laptop", 1000.0);
//            System.out.println("Sorting items in ascending order:");
//            ei.sortByValue(true);
            ei.returnPriceItem(map);
        }

        void itemHashMap(String name, double price)
        {
            map.put(name, price);
        }

        void sortByValue(boolean order)
        {
            List<Entry<String, Double>> list = new LinkedList<Entry<String, Double>>(map.entrySet());

            Collections.sort(list, new Comparator<Entry<String, Double>>(){
                public int compare(Entry<String, Double> o1, Entry<String, Double> o2){
                        return o1.getValue().compareTo(o2.getValue());
                }
            });

            Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();

            for (Entry<String, Double> entry : list)
            {
                sortedMap.put(entry.getKey(), entry.getValue());
            }

            returnPriceItem(sortedMap);
        }

        static void returnPriceItem(Map<String, Double> map){
            System.out.println("Price "+" \t"+"Item");
            System.out.println("-----------------------------");
            for (Entry<String, Double> entry : map.entrySet())
            {
                System.out.println(entry.getValue() +" \t"+entry.getKey());
            }
        }
    }
