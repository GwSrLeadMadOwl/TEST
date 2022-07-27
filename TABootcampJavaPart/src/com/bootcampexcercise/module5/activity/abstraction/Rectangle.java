package com.bootcampexcercise.module5.activity.abstraction;

public class Rectangle extends Shape {

    private double a,b;

    public Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }

//    public double setParams(double a, double b){
//        return a, b;
//    }

    public double calculateArea() {
        return (a*b);
    }

    public double calculatePerimeter() {
        return (a+b)*2;
    }

    public void setColor(String c) {
        super.setColor(c);
    }
}
