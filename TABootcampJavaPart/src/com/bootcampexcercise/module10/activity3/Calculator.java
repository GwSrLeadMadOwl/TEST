package com.bootcampexcercise.module10.activity3;

import java.security.InvalidAlgorithmParameterException;

public class Calculator extends Throwable {
    private double a,b;

    public static void main(String args[]) throws InvalidAlgorithmParameterException {
        Calculator cal = new Calculator();
        cal.divide(4, 5);
        cal.multiply(10,2);
        cal.multiply(100, 200);
    }


    public double add(double a, double b){
        return (a+b);
    }

    public double subtract(double a, double b){
        return (a-b);
    }

    public double divide(double a, double b) throws IllegalArgumentException{
        double res = 0;
        try {
            res = (a/b);
        }catch(IllegalArgumentException iae){
            System.out.println("Invalid inputs");
        }finally {
                res = (a/b);
        }
        System.out.println(res);
        return res;
    }

    public double multiply(double a, double b){
        return (a*b);
    }

//    public double multiply(double a, double b) throws CustomizedException{
//        double res = 0;
//        try {
//            return res =(a * b);
//            if(res>=2000){ //Unreachable statement
//                throw new CustomizedException();
//            }
//        }catch(CustomizedException ce){
//            ce.getMessage();
//        }finally {
//            if(res>0 && res<2000){
//                System.out.println(res);
//            }
//        }
//        return res;
//    }

}
