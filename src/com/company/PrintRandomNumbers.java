package com.company;

public class PrintRandomNumbers {
    public static double[] generateRandomNumber (){

        double[] list = new double[10];
        for (int i = 0; i < 10 ; i++){
            list[i] = Math.random() *100;
        }
        return list;

    }

}
