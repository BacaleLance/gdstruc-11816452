package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 7;
        numbers[1] = 3;
        numbers[2] = 6;
        numbers[3] = 4;
        numbers[4] = 77;
        numbers[5] = 36;
        numbers[6] = 62;
        numbers[7] = 30;
        numbers[8] = -1;
        numbers[9] = 81;

        int[] numbers1 = new int [10];

        numbers1[0] = 8;
        numbers1[1] = 4;
        numbers1[2] = 7;
        numbers1[3] = 5;
        numbers1[4] = 78;
        numbers1[5] = 37;
        numbers1[6] = 63;
        numbers1[7] = 31;
        numbers1[8] = -2;
        numbers1[9] = 82;

        System.out.println("Before bubble sort");
        printArrayElements(numbers);

        bubbleSortDescending(numbers);

        System.out.println("\n\nAfter bubble sort");
        printArrayElements(numbers);

        System.out.println("\n\nBefore selection sort");
        printArrayElements(numbers1);

       selectionSortDescending(numbers1);

        System.out.println("\n\nAfter selection sort");
        printArrayElements(numbers1);
    }
    private static void bubbleSortDescending(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSortDescending(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }
    private static void printArrayElements(int[]arr)
    {
        for (int j : arr){
            System.out.print(j + "   ");
        }
    }
}
