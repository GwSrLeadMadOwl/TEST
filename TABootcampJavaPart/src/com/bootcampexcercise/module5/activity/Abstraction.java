package com.bootcampexcercise.module5.activity;

public abstract class Abstraction {
    public static void main(String args[]){
        System.out.println("Rectangle");
        Shape rec = new Rectangle(5,6);
        rec.calculateArea();
        rec.calculatePerimeter();
        rec.getColor();

        System.out.println("");

        System.out.println("Circle");
        Shape cic = new Circle(5);
        rec.calculateArea();
        rec.calculatePerimeter();
        rec.getColor();
    }
}
