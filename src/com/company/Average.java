package com.company;

public class Average {
    public static int CalculateAverage(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];

        }
        int Avg = sum / list.length;
        return (Avg);
    }
}
