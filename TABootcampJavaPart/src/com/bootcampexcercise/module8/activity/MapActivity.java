package com.bootcampexcercise.module8.activity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapActivity {

    public static void main(String[] args) {
        //1 - Type code to create a HashMap of key value pair
        MapActivity ma = new MapActivity();
        Map map = new HashMap();
        //where key is id of type String and value is a name
        map.put("Name", "Sergei");
        map.put("Surname", "Rogozinnikov");
        map.put("Age", 30);
        map.put("City", "Riga");
        //2 - Call print method to print the map passed as its parameter.
        ma.print(map);
    }

    void print(Map map)
    {
        //3 - Type code to print this map
        Set keySet = map.keySet();

        //You can use an iterator to access keys
        System.out.println("*************************************");
        System.out.println("Key "+"\t"+"Value");
        System.out.println("-------------------------------------");
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }

        System.out.println("*************************************");
    }
}
