
package com.cmcglobal.baitap3;

import java.util.Scanner;
import java.util.Random;


import static java.sql.DriverManager.println;

public class Main {
    public static void main(String[] args) {
        /*
        FizzBuzz Variation with Switch and For Loop
Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz", for
multiples of 5, print "Buzz", and for numbers that are multiples of both 3 and 5, print
"FizzBuzz". Use a for loop and a switch statement to handle this.

*/
/*
        for (int i = 0; i <= 100; i++)
        {
            if (i % 3 ==0)
            {
                System.out.println("Fizz");
            }
            else if (i % 5 ==0) {
                System.out.println("Buzz");
            } else if (i % 3 ==0 && i % 5 ==0)
            {
                System.out.println("FizzBuzz");
            } else
            {
                System.out.println(i);
            }

        }
    }
}
*/

     /*   Exercise 2: Grade Calculation Using Switch
        Write a program that calculates the grade based on the percentage entered by the user. The
        program should categorize the grade using a switch statement. The grades should be
        categorized as follows:
● A for 90-100%
● B for 80-89%
● C for 70-79%
● D for 60-69%
● F for 0-59%
*/
/*
        Scanner scanner = new Scanner(System.in);
        //Input your grade
        System.out.println("Please input your grade: ");

        int percentage  = scanner.nextInt();
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid input! Please enter a percentage between 0 and 100.");
            return;
        }
        int grade = percentage /10;

        switch (grade) {
            case 10:
                System.out.println("Xeploai: A" );
                break;

            case 9:
                System.out.println("Xeploai: A" );
                break;
            case 8:
                System.out.println("Xeploai: B" );
                break;
            case 7:
                System.out.println("Xeploai: C" );
                break;
            case 6:
                System.out.println("Xeploai: D" );
                break;
            default:
                System.out.println("Xeploai: F" );
                break;
        }
    }
}
*/
/*Exercise 3: Guess the Number Game
Write a program that randomly generates a number between 1 and 10. The user needs to guess
the generated number. After each guess, the program will provide feedback, informing the user
whether their guess is too high, too low, or correct. The game will continue until the user
correctly guesses the number. Once the correct number is guessed, the program will display the
total number of attempts it took the user to guess correctly.
*/

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        //random so tu 1-10
        int targetNumber = random.nextInt(10) + 1;
        int userGuess = 0;
        int attempts = 0;

        while (userGuess != targetNumber) {
        System.out.print("Input number between 1 and 10: ");
        userGuess = scanner.nextInt();
        attempts++;

        //so sanh ket qua user nhap voi so random
        if (userGuess < targetNumber) {
            // Hien thi thong bao ket qua nhap so cua user
        System.out.println("Your number is too low. Try again!");
            } else if (userGuess > targetNumber) {
        System.out.println("Your number is too high. Try again!");
            } else {
                    System.out.println("Congratulations! You number is the correct number.");
            }
        }
        // hien ti so lan doan cua user
        System.out.println("It took you " + attempts + " attempts to guess the correct number.");

        scanner.close();
    }
}


