package com.bootcampexcercise.module5.activity;

public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }

//    public double setRadius(double r){
//        return r;
//    }

    public double calculateArea(){
        return (Math.PI * Math.sqrt(r));
    }

    public double calculatePerimeter(){
        return (Math.PI * r);
    }

    public void setColor(String c) {
        super.setColor(c);
    }
}
