package com.bootcampexcercise.module10.activity3;

public class Calculator2  extends Throwable {
    private double a,b;

    public static void main(String args[]) throws CustomizedException {
        Calculator2 cal = new Calculator2();
        CustomizedException ce = new CustomizedException();

        cal.multiply(10, 2);
        cal.multiply(100, 200);
    }

    double multiply(double a, double b) throws CustomizedException{
        double res = 0;
        try {
            return res =(a * b);
            if(res>=2000){ //Unreachable statement
                throw new CustomizedException();
            }
        }catch(CustomizedException ce){
            ce.getMessage();
        }finally {
            if(res>0 && res<2000){
                System.out.println(res);
            }
        }
        return res;
    }
}
