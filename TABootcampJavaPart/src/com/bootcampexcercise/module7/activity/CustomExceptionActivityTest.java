package com.bootcampexcercise.module7.activity;

import  java.util.Arrays;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

import org.apache.groovy.json.internal.ArrayUtils;

public class CustomExceptionActivityTest {

    //1 - Type main method and call validateUser() from it.
    //Call this method with different names to test it
    public static void main(String args[]) throws CustomExceptionActivity { //IF I DON'T WANT TO WRITE THROWS
        CustomExceptionActivityTest cea = new CustomExceptionActivityTest();

        cea.validateUser("Gandalf"); //USE TRY/CATCH
        cea.validateUser("Mike");
    }

    void validateUser(String name) throws CustomExceptionActivity{
        //array of names
        int flag = 0;

        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
        try {
//            System.out.println(Arrays.asList(validUsers).contains(name));

            for (int i = 0; i < 4; i++) {
                if (name == validUsers[i]) {
                    flag++;
                }
            }
            if (flag == 0) {
                throw new CustomExceptionActivity();
            }
        }catch(CustomExceptionActivity cea){

            cea.getMessage();
        }finally{
            if(flag > 0) {
                System.out.println("Welcome to Payroll program, " + name);
            }
        }
    }
}
