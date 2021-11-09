/*
*   Author: Tyler Osborne
*   Date: 2021-11-09
 */


package ca.durhamcollege;

import java.util.InputMismatchException;
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

        boolean validInput = false;
        while (validInput == false)
        {
            System.out.print("Please enter your age: ");
            try
            {
                age = scanner.nextFloat();
                validInput = true;

                if((age <= 0.0f) || (age >= 120.0))
                {
                    System.out.printf("ERROR: You must enter an age greater then 0.0 and less then 120.0\n");
                    scanner.nextLine();
                    validInput = false;
                }
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.out.printf("ERROR: You must enter a valid floating-point number\n");
                scanner.nextLine();
                validInput = false;
            }

        }

        // Output
        System.out.println();
        System.out.printf("You Entered: %s \n",name);
        System.out.printf("You Entered: %.2f \n",age);

    }
}
