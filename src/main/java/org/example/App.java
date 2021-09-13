package org.example;

import java.util.Scanner;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */
public class App 
{
    public static void main(String[] args )
    {
        final double MALE = 0.73;
        final double FEMALE = 0.66;

        Scanner sc = new Scanner(System.in);
        int  oz, wight, time;
        double sex, BAC;

        try{
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            sex = sc.nextInt();
            if (sex == 1) sex = MALE;
            else sex = FEMALE;

            System.out.print("How many ounces of alcohol did you have? ");
            oz = sc.nextInt();

            System.out.print("What is your weight, in pounds? ");
            wight = sc.nextInt();

            System.out.print("How many hours has it been since your last drink? ");
            time = sc.nextInt();

            BAC = (oz * 5.14 / wight * sex) - 0.015 * time;

            System.out.printf("Your B.A.C is %.6f\n", BAC);
            if (BAC < 0.08) System.out.println("It is legal for you to drive.");
            else System.out.println("It is not legal for you to drive.");

        }catch (Exception InputMismatchException)
        {
            System.out.println("Non numeric value entered!");
        };



    }
}
