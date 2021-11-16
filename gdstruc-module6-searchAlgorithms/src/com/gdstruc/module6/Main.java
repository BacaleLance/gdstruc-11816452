package com.gdstruc.module6;

import java.util.Random;


public class Main {

    public static void main(String[] args) {

        int[] arrayOfNumbers = {5, 29, 101, 52, 19, 10, 98};


        System.out.println("Index: " + rngSearch(arrayOfNumbers, 10));

    }
        public static int rngSearch(int[] input, int value)
        {
            int num = 0;


               do
               {
                   int rng = (int) (Math.random() * (7 - 1 + 1) + 1);
                   for (int i = 0; i < rng; i++)
                   {

                       if (input[i] == value)
                       {
                           num = i;
                           return i;
                       }
                        else num = 1;
                   }

                   System.out.println(rng); // prints rng

               }while (num != value);


             return -1;
        }

}
