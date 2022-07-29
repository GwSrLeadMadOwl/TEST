package com.bootcampexcercise.module10.activity1_activity2;

public class Employee extends Person{
    private String jobTitle, company;
    private double salary;

    void Employee(String jobTitle, String company,double salary){
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
        return jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }

    public String setCompany(String company){
        this.company = company;
        return company;
    }

    public String getCompany(){
        return company;
    }

    public double setSalary(double salary){
        this.salary = salary;
        return salary;
    }

    public double getSalary(){
        return salary;
    }

    public String setName(String name){
        return super.setName(name);
    }

//    public String getName(){
//        return name;
//    }

    public int setAge(int age){
        return super.setAge(age);
    }

//    public int getAge(){
//        return age;
//    }

    @Override
    public String introduce(){
        String intro1 = "My name is " + name + " and I am " + age + " years old.\n";
        String intro2 = "I am work as "+ jobTitle + " in "+ company + " and my salary is "+ salary;
        return intro1 + intro2;
    }
}
