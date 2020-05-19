package com.academy.git;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("Si no estan estos cambios hay tabla!");

        int number1 = 7;
        int number2 = 4;
        int number3 = 2;
        int number4 = 1;
        int number5 = 3;

        int sum = sum(number1, number2);
        System.out.println("The sum of " + number1 + " and " +
                number2 + " equals: " + sum);
       
        sum = sum(number1, number2, number3);
        System.out.println("The sum of " + number1 + " and " + number2 + " and " + number3 + " equals: " + sum);
        
        sum = sum(number1, number2, number3, number4);
        System.out.println("The sum of " + number1 + " and " + number2 + " and " + number3 + " and " + number4 + " equals: " + sum);
        
        sum = sum(number1, number2, number3, number4, number5);
        System.out.println("The sum of " + number1 + " and " + number2 + " and " + number3 + " and " + number4 + " and " + number5 + " equals: " + sum);
    }

    public static int sum(int num1, int num2) {

        return num1 + num2;
    }
	
	public static int res(int num1, int num2) {

        return num1 - num2;
    }
	
	public static int mul(int num1, int num2) {

        return num1 * num2;
    }
	
	public static int sum(int... numbers) {
		int total=0;
		for (int i : numbers) {
			total = sum(total, i);
		}
		return total;
	
	}
}