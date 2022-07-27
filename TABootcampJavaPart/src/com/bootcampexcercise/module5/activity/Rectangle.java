package com.bootcampexcercise.module5.activity;

public class Rectangle extends Shape{

    private double a,b;

    public Rectangle(double a,double b){
        this.a = a;
        this.b = b;
    }

    public double calculateArea(a, b) {
        return (a*b);
    }

    public double calculatePerimeter(a, b) {
        return (a+b)*2;
    }

    public void setColor(String c) {
        super.setColor("Sky blue");
    }
}
