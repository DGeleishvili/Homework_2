package com.company;

public class Main {


    public static void main(String[] args) {

        //print odd numbers from 0 to 30;
        printOddNumbers.printOdd();

        //print random number
        System.out.println("Random numbers from 0 to 100");
        double[] randomNumbers = PrintRandomNumbers.generateRandomNumber();
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);

        }
        System.out.println("\n");
        //print Average
        System.out.println("print Average");
        System.out.println(Average.CalculateAverage(new int[]{2,10,17,65,44}));
        System.out.println("\n");

        //print MinValue
        System.out.println("Print MinValue");
        System.out.println(MinValue.GetMinValue(new int[]{93,85,43,23,2}));
    }

}
