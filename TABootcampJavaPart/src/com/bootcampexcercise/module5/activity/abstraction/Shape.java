package com.bootcampexcercise.module5.activity.abstraction;

public abstract class Shape {
    public String color;

    public Shape() {
    }

    //TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void setColor(String c) {
        color = c;
    }

    public String getColor() {
        return color;
    }
}
