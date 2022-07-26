package com.bootcampexcercise.module2.activity;

public class NumToWords {
    public static void main(String args[]){
        for(int i = 0; i<5; i++) {
            double x = Math.random()*11;
            String numText = "";
            switch ((int)x) {
                case 1:
                    numText = "one";
                    break;
                case 2:
                    numText = "two";
                    break;
                case 3:
                    numText = "three";
                    break;
                case 4:
                    numText = "four";
                    break;
                case 5:
                    numText = "five";
                    break;
                case 6:
                    numText = "six";
                    break;
                case 7:
                    numText = "seven";
                    break;
                case 8:
                    numText = "eight";
                    break;
                case 9:
                    numText = "nine";
                    break;
                case 10:
                    numText = "ten";
                    break;
                default:
//                System.out.println("implementation to support numbers 1-10");
                    numText = "Number " + x;
            }
            System.out.println(numText);
        }
    }
}
