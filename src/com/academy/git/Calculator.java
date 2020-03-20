package com.academy.git;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Si no están estos cambios hay tabla!");

        int number1 = 7;
        int number2 = 4;

        int sum = sum(number1, number2);
        System.out.println("The sum of " + number1 + " and " +
                number2 + " equals: " + sum);
    }

    public static int sum(int num1, int num2) {

        return num1 + num2;
    }
	
	public static int res(int num1, int num2) {

        return num1 - num2;
    }
}