package com.bootcampexcercise.module2.activity;

public class NumToWordsUsingMethod {
    static String[] arr= {"one","two","three", "four","five", "six", "seven", "eight", "nine","ten"};

    public static void main(String args[]){
        returnWord(6);

    }
    public static void returnWord(int num){
        System.out.println(arr[num-1]);
    }
}
