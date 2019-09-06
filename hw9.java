/*****************************************************************
//
//  NAME:        Ravi Narayan
//
//  HOMEWORK:    9
//
//  CLASS:       ICS 212
//
//  INSTRUCTOR:  Ravi Narayan
//
//  DATE:        April 26, 2019
//
//  FILE:        hw9.java
//
//  DESCRIPTION:
//   This file contains the main and the print table functions
//   for Homework 9 that will run the code, make the user interface 
//   and print the output
//
****************************************************************/

import java.util.Scanner;

public class hw9
{
    static 
    {
        System.loadLibrary("hw9");
    }

    private native double func(double userInput);
    
    /*****************************************************************
    //
    //  Function name: print_table
    //
    //  DESCRIPTION:   The function that will print a table of
    //                 values for x and func(x)
    //
    //  Parameters:    userInput (double) : contains the number 
    //                                      that will be the value
    //                                      of x to be passed into
    //                                      func and printed 
    //
    //  Return values:  N/A
    //
    ****************************************************************/

    private static void print_table(double userInput)
    {
        double i;
        double output;

        System.out.printf("%5c %8c\n", 'x', 'y');
        for (i = 0; i < userInput; i += 0.5)
        {
            hw9 cobj = new hw9();
            output = (double) cobj.func(i);
            System.out.printf("%8.2f %8.2f\n", i, output);
        }
    }

    /*****************************************************************
    //
    //  Function name: userInterface
    //
    //  DESCRIPTION:   A userinterface function
    //                 This function obtains the values of the
    //                 maximum value from the user
    //
    //  Parameters:    N/A
    //
    //  Return values:  uinput: the user inputted maximum value
    //
    ****************************************************************/
    
    private static int userInterface()
    {
        int uinput = 0;
        boolean badInput = true;

        System.out.println("This program will print a table of x");
        System.out.println("and f(x) for x from 0 to the user");
        System.out.println("inputted integer with f(x) being");
        System.out.println("equal to:");
        System.out.println("x^2 for x < 5");
        System.out.println("x^2 - 3x - 10 for 5 <= x < 10");
        System.out.println("x^2 - 7x - 8 for 10 <= x.");
 
        Scanner read = new Scanner(System.in);
        System.out.print("Enter number of x: ");
        
        while (badInput)
        {
            if (read.hasNextInt())
            {
                uinput = read.nextInt();
       	       	badInput = false;

                if (uinput <= 0)
                {
                    System.out.print("Enter a positive integer: ");
                    badInput = true;
                }
            }
            else
            {
               	System.out.print("Enter a positive integer: ");
       	       	badInput = true;
       	    }
            read.nextLine();
        }

        return uinput;
    }
    
    /*****************************************************************
    //  
    //  Function name: main
    //
    //  DESCRIPTION:   The main function that will execute print_table()
    //
    //  Parameters:    N/A
    //
    //  Return values:  N/A
    //
    ****************************************************************/

    public static void main(String [] args)
    {
        double uinput;

        uinput = (double) userInterface();
        print_table(uinput); 
    }
}
