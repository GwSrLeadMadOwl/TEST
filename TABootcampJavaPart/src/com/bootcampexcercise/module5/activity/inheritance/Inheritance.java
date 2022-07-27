package com.bootcampexcercise.module5.activity.inheritance;

public class Inheritance {

    public static void main(String[] args) {

        // Create Person object p. Write code to and set name of Person as Sarah Johnson
        // and age as 21
//        Person_I p = new Person_I("Sarah Johnson", 21);
        Person_I p = new Person_I();
        p.setName("Sarah Johnson");
        p.setAge(21);

//        Sting pName = p.getName();
//        Int pAge = p.getAge();



        //Create Employee object e and
        // set salary as 70000.00, title as Developer, age as 32 and name as Shawn Cun
        Employee_I e = new Employee_I();
        e.setName("Shawn Cun");
        e.setAge(32);
        e.setSalary(70000);
        e.setTitle("Developer");

        // Print Info using Employee object
        System.out.println("Name: "+e.getName() +" Age: "+ e.getAge() +" Job title: "+ e.getTitle() +" Salary: "+ e.getSalary());

        // Print Info using Person object
        System.out.println("Name: "+p.getName() +" Age: "+ p.getAge());

    }

}
