
package com.cmcglobal.baitap21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//        Exercise 1: Simple Calculator
//        Objective: Practice using arithmetic operators, input/output, and basic data types.
//        1. Write a Java program that prompts the user to enter two integers.
//        2. Perform the addition, subtraction, multiplication, and division of these two numbers.
//        3. Display the results to the user

/*        int x = 5;
        int y = 3;
        int z1;
        int z2;
        int z3;
        int z4;

        z1 = x + y;
        z2 = x - y;
        z3 = x % y;
        z4 = x * y;
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
        System.out.println(z4);

 */


//        Exercise 2: Temperature Converter
//        Objective: Practice using arithmetic operators, input/output, and data types.
//        1. Write a Java program that prompts the user to enter a temperature in Celsius.
//        2. Convert the temperature to Fahrenheit using the formula: F = (C * 9/5) + 32.
//        3. Display the temperature in Fahrenheit.

/*        Scanner scanner = new Scanner(System.in);
        //Enter a temperature in Celsius
        System.out.println("Please enter a temperature in Celsius: ");
        Float Celsius = scanner.nextFloat();

        //Convert the temperature to Fahrenheit
        Float Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("The temperature in Fahrenheit: " + Fahrenheit);
*/

        /*
        Exercise 3: BMI Calculator
        Objective: Practice using arithmetic operators, input/output, and data types.
        1. Write a Java program that prompts the user to enter their weight (in kilograms) and height (in meters).
        2. Calculate the Body Mass Index (BMI) using the formula: BMI = weight / (height * height).
        3. Display the BMI to the user.
         */

/*        Scanner scanner = new Scanner(System.in);
        //Input your weight
        System.out.println("Please input your weight: ");
        double weight = scanner.nextDouble();

        //Input your hight
        System.out.println("Please input your height: ");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your BMI: " + bmi);

 */
/*
        Exercise 4: Counter Program
        Objective: Practice using increment and decrement operators, input/output, and basic data
        types.
        1. Write a Java program that prompts the user to enter an integer. The program should
        then increment and decrement the integer, displaying the results.
        Requirements:
        1. Prompt the user to enter an integer.
        2. Increment the integer using the ++ operator and display the result.
        3. Decrement the integer using the -- operator and display the result.

 */
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int number = scanner.nextInt();
        number++;
        System.out.println("Decrement: " + number);
        number--;
        System.out.println("Increment: " + number);
*/

        /*
        Exercise 5: Leap Year Checker
        Objective: Practice using logic conditions and input/output.
        1. Write a Java program that prompts the user to enter a year.
        2. Check if the year is a leap year using the following conditions:
        3. A year is a leap year if it is divisible by 4, except for years divisible by 100, but these
        centurial years are leap years if they are divisible by 400.
        4. Display whether the year is a leap year or not.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a year: ");

        int year = scanner.nextInt();

        boolean isleapyear = false;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
        {
            isleapyear =true;
        }
        else
        {
            isleapyear =false;
        }
        if (isleapyear) {
            System.out.println("The year is a leapyear");
        }
        else
        {
            System.out.println("The year is not a leapyear");
        }

    }
}