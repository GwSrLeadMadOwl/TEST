package com.bootcampexcercise.module10.activity1_activity2;

public abstract class Person {
    String name;
    int age;

    void Person(){
        this.name = "Unknown";
        this.age = 0;
    }

    void Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public abstract String introduce();

    public String setName(String name){
        this.name = name;
        return name;
    }

    public String getName(){
        return name;
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }

    public int getAge(){
        return age;
    }
}
