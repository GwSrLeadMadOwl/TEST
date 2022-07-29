package com.bootcampexcercise.module10.activity4;

import com.bootcampexcercise.module10.activity1_activity2.Employee;

import java.util.*;

public class EmployeeList {

    public static void main(String[] args) {
        Employee driver = new Employee();
        driver.setJobTitle("Driver");
        driver.setCompany("SWG");
        driver.setSalary(5000);

        Employee hitman = new Employee();
        hitman.setJobTitle("Hitman");
        hitman.setCompany("Codename47");
        hitman.setSalary(1000000);

        Employee programmer = new Employee();
        programmer.setJobTitle("Programmer");
        programmer.setCompany("Accenture");
        programmer.setSalary(10000);

        Employee master = new Employee();
        master.setJobTitle("Master");
        master.setJobTitle("Latvia");
        master.setSalary(100000);

        Employee bum = new Employee();
        bum.setJobTitle("Bum");
        bum.setJobTitle("GroveStreetFamily");
        bum.setSalary(300);

        List <Employee> list = new ArrayList <Employee>();
        list.add(driver);
        list.add(hitman);
        list.add(programmer);
        list.add(master);
        list.add(bum);

//        EmployeeList arr = new EmployeeList();
//        arr.print(list);
        Collections.sort(list);
        System.out.println(list);
    }

    void print(List list)
    {
        Iterator<Object> nameOfIterator = list.iterator();
        for (Object nameOfMyObject : list) {
            System.out.println(nameOfMyObject.toString());
        }
    }

    void getHighestPaidEmp(){
        System.out.println("The Employee whose salary is the highest is: ");
    }
//    void sortByValue(boolean order)
//    {
//        List<Map.Entry<String, Double>> list = new LinkedList<Map.Entry<String, Double>>(list.entrySet());
//
//        Collections.sort(list, new Comparator<Map.Entry<String, Double>>(){
//            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2){
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//
//        Map<String, Double> sortedMap = new LinkedHashMap<String, Double>();
//
//        for (Map.Entry<String, Double> entry : list)
//        {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }
//        System.out.println(sortedMap);
////        print(sortedMap);
//    }

//    public void printList(List<String, Double> list)
//        {
//            System.out.println("Company "+" \t "+"Price ");
//            for (Map.Entry<String, Double> entry : list.toString())
//            {
//                System.out.println(entry.getKey() +" \t"+entry.getValue());
//            }
//            System.out.println("\n");
//        }
}
