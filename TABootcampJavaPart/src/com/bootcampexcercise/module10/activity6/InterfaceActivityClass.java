package com.bootcampexcercise.module10.activity6;

public class InterfaceActivityClass {
    static Vehicle car = new Car();
    static Vehicle bike = new Bike();
    public static void main(String args[]){
        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }

}
