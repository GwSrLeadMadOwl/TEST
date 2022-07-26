package com.bootcampexcercise.module2.activity;

import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            char operator;
            double num1;
            double num2;
            double result;

            Scanner input = new Scanner(System.in);

            while (true) {
                System.out.println("First number");
                num1 = input.nextDouble();

                System.out.println("Operator");
                operator = input.next().charAt(0);

                System.out.println("Second number");
                num2 = input.nextDouble();

//          input.close();
                input.reset();

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            result = 0;
                        }
                        break;
                    default:
                        return;
                }
                System.out.print(result + "\n");
            }
        }
}
