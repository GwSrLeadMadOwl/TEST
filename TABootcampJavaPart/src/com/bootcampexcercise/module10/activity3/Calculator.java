package com.bootcampexcercise.module10.activity3;

import java.security.InvalidAlgorithmParameterException;

public class Calculator extends Throwable {
    private double a,b;

    public static void main(String args[]) throws InvalidAlgorithmParameterException {
        Calculator cal = new Calculator();
        cal.divide(4, 5);
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
            if(a>b){
                res = (a/b);
            }else if (a<b){
                res =(b/a);
            }
        }
        System.out.println(res);
        return res;
    }

    public double multiply(double a, double b){
        return (a*b);
    }
}
