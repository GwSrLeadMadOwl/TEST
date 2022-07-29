package com.bootcampexcercise.module10.activity1_activity2;

public abstract class AbstractActivity {
    public static void main(String args[]) {

        Employee emp = new Employee();

        System.out.println("Employee");
        emp.setName("Sarah Johnson");
        emp.setAge(21);
        emp.setJobTitle("Web developer");
        emp.setCompany("Accenture");
        emp.setSalary(100000);
        System.out.println(emp.introduce());

        System.out.println("");

        Student st = new Student();
        System.out.println("Student");
        st.setSchoolName("Hogwarts");
        System.out.println(st.introduce());
    }
}
