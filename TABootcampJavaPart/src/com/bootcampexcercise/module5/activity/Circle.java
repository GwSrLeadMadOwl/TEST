package com.bootcampexcercise.module5.activity;

public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double calculateArea(r){
        return (Math.PI * Math.sqrt(r));
    }

    public double calculatePerimeter(r){
        return (Math.PI * r);
    }

    public void setColor(String c) {
        super.setColor("Pink");
    }
}
