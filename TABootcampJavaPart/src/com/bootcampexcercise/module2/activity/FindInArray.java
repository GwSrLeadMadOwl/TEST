package com.bootcampexcercise.module2.activity;

import java.util.Arrays;

public class FindInArray {

    static int count = 10;
    static int[] arr = new int[count];

    public static void createNumbersInArray(int count){
        for(int i=0; i<count; i++){
            double num = Math.random()*100;
//            arr.push((int)num);
            arr[i]=((int)num);
//            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        createNumbersInArray(count);
//        System.out.println(arr[count-1]);
        Arrays.sort(arr);
        Arrays.toString(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[count-1]);
    }
}
