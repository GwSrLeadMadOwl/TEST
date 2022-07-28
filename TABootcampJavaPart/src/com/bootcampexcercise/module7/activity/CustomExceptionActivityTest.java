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
        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};
//flag stores 1 if a match is found else it should remain 0
        try {
//            System.out.println(Arrays.asList(validUsers).contains(name));

            int flag = 0;
            for (int i = 0; i < 4; i++) {
//          if (Arrays.asList(validUsers).contains(name)) {
                if (name == validUsers[i]) {
                    flag++;
//                System.out.println("Welcome to Payroll program, " + name);
                }
//          } else if (!Arrays.asList(validUsers).contains(name)) {
//            else if(flag == 0 && name != validUsers[i]){
////            else{
//                throw new CustomExceptionActivity();
//            }
//            System.out.println(validUsers[i]);

//            continue;
            }
//            if (flag == 0) {
//                throw new CustomExceptionActivity();
//            } else {
//                System.out.println("Welcome to Payroll program, " + name);
//            }
        }catch(CustomExceptionActivity cea){
            throw new CustomExceptionActivity();
        }finally{
            System.out.println("Welcome to Payroll program, " + name);
        }
//3 - check if flag is zero, throw CustomExceptionActivity Exception.
//You may also have to declare this exception in the method call using throws.


//4 - else if flag is one, print a message "Welcome to Payroll program".

    }
}
