package com.bootcampexcercise.module2.activity;

import java.util.Arrays;

public class MultiplicationTable {
    static Integer[] num1 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static Integer[] num2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int arrLength = num1.length;

    public static void main(String args[]){
        for(int i=0; i<arrLength-1; i++){
            for (int j = 0; j < arrLength-1; j++) {
                System.out.println(num1[i] + " * " + num2[j] +" = "+(num1[i] * num2[j]));
            }
        }
    }
}
