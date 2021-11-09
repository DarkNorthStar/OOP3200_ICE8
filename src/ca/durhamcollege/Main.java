/*
*   Author: Tyler Osborne
*   Date: 2021-11-09
 */


package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Variables
        String name = null;
        float age = 0.0f;

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.print("Please enter your age: ");
        age = scanner.nextFloat();
        System.out.println();

        // Output
        System.out.printf("You Entered: %s \n",name);
        System.out.printf("You Entered: %.2f \n",age);

    }
}
