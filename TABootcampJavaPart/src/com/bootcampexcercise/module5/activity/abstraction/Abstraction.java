package com.bootcampexcercise.module5.activity.abstraction;

public abstract class Abstraction {
    public static void main(String args[]){
        System.out.println("Rectangle");
        Shape rec = new Rectangle(5,6);
        System.out.println("Rectangle Area: "+ rec.calculateArea());
        System.out.println("Rectangle Perimeter: "+ rec.calculatePerimeter());
        rec.setColor("Sky blue");
        System.out.println("Rectangle Color: "+ rec.getColor());

        System.out.println("");

        System.out.println("Circle");
        Shape cir = new Circle(5);
        System.out.println("Circle Area: " + cir.calculateArea());
        System.out.println("Circle Perimeter: " + cir.calculatePerimeter());
        cir.setColor("Pink");
        System.out.println("Circle Color: " + cir.getColor());
    }
}
