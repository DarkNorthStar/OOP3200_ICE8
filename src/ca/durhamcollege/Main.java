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


        // Multi-Dimensional Array
        System.out.println("\nMulti-Dimensional Array");
        int rows = 8;
        int cols = 8;

        float[][] board = new float[rows][cols];

        for (int x = 0; x < rows; x++)
        {
            for (int y = 0; y < cols; y++)
            {
                board[x][y] = (float)(Math.random() * 100.0) + 1.0f;
            }
        }

        for(int i = 0; i < 10; i++)
        {
            int randRows = (int)(Math.random() * rows);
            int randCols = (int)(Math.random() * cols);
            System.out.print("For row: " + randRows + " col: " + randCols + " ");
            System.out.printf("The Random number is: %.2f \n", board[randRows][randCols]);
        }



    }
}
