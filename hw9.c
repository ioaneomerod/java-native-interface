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
//  FILE:        hw9.c
//
//  DESCRIPTION:
//   This file contains the driver and the func function 
//   for Homework 9 and will be the only C code in the homework
//
****************************************************************/

#include <math.h>
#include "hw9.h"

/*****************************************************************
//
//  Function name: func
//
//  DESCRIPTION:   A function that takes a value, x, and
//                 and returns a number based on these functions:
//                 x^2 for x < 5
//                 x^2 - 3x - 10 for 5 <= x < 10
//                 x^2 - 7x - 8 for 10 <= x
//
//  Parameters:    userInput (double) : contains the value
//                                      which will be put into
//                                      the function
//
//  Return values:  output : output double found based on
//                           the function
//
****************************************************************/

JNIEXPORT double Java_hw9_func(JNIEnv *env, jobject thisObj, jdouble userInput)
{
    double output;

    if (userInput < 5)
    {
     	output = pow(userInput, 2);
    }

    else if ((5 <= userInput) < 10)
    {
     	output = pow(userInput, 2) - (3 * userInput) - 10;
    }

    else if (10 <= userInput)
    {
     	output = pow(userInput, 2) - (7 * userInput) - 8;
    }

    return output;
}

