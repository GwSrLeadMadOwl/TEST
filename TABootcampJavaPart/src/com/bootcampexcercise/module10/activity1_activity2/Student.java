package com.bootcampexcercise.module10.activity1_activity2;

public class Student extends Person{
    private String schoolName;

    void Student(){
        this.schoolName = "Unknown";
    }

    void Student(String schoolName){
        this.schoolName = schoolName;
    }

    public String setSchoolName(String schoolName){
        this.schoolName = schoolName;
        return schoolName;
    }
    public String getJobTitle(){
        return schoolName;
    }

    @Override
    public String introduce(){
        String intro1 = "I'm study in university " + schoolName + ".\n";
        return intro1;
    }
}
