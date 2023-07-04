/*
 *  Assignment Lab 5
 *  Description: This program allows the user to input a number and with the use of loops, a pyramid pattern will be printed.
 *  Name: James Giatpaiboon
 *  ID: 917848716
 *  Class: CSC 211-03
 *  Semester: Fall 2019
 */

import java.util.Scanner;   // imported scanner for user

public class Lab5 {
    public static void main(String[] args) {

        int number; // number that user inputs for the pyramid

        Scanner input = new Scanner(System.in); // scanner used to read what the user inputs

        System.out.println("Enter desired height of the pyramid:"); // prompts user to input a number for their pattern
        number = input.nextInt();   // stores the number that user inputs

        for (int i = 0; i < number; i++) //loop for the number of rows depending on number entered by user
        {
            for (int j = number - i; j > 1; j--) //loop for number of spaces needed for pyramid pattern
            {
                System.out.print(" "); //print space
            }
            for (int j = 0; j <= i; j++) //loop for number of columns needed for pyramid
            {
                System.out.print("* "); //prints the pyramid pattern of stars
            }

            System.out.println(); //line after each row is created
        }
    }
}