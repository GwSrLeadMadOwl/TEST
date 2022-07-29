package com.bootcampexcercise.module10.activity4;

import com.bootcampexcercise.module10.activity1_activity2.Employee;

import java.util.*;

public class EmployeeList {
    static List <Employee> list = new ArrayList <Employee>();

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

        list.add(driver);
        list.add(hitman);
        list.add(programmer);
        list.add(master);
        list.add(bum);

//        EmployeeList arr = new EmployeeList();
//        arr.print(list);
//        Collections.sort(list);
        System.out.println(list);
        System.out.println("The Employee whose salary is the highest is: " + list.getHighestPaidEmp());

    }

    public double getHighestPaidEmp(){
        double high = 0;

        if (list.size() > 1){

            Optional<Employee> max = list
                    .stream()
                    .max(Comparator.comparingDouble(Employee::getSalary));

            high =  max.get().getSalary();

        }else if (list.size() == 1){

            high = list.get(0).getSalary();
        }
        return high;
    }
}
