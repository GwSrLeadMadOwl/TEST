package com.bootcampexcercise.module4.activity;

public class FindLargest {
    public static void main(String args[]){
        double num1 = Math.random() * 100;
        double num2 = Math.random() * 100;
        if(num1>num2){
            System.out.println((int) num1 + ">"+(int) num2);

        }else if(num1 == num2){
            System.out.println((int) num1 + "="+(int) num2);
        }else{
            System.out.println((int) num1 + "<"+(int) num2);
        }
    }
}
