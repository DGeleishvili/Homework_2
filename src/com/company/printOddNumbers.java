package com.company;

public class printOddNumbers {
    public static void printOdd(){
        int num = 30;

        System.out.println("Odd numbers from 0 to "+num+": ");

        for (int i = 1; i <= num; i++)
        {

            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}
