package com.company;

public class MinValue {
    public static int GetMinValue(int[] list) {
        int minValue = list[0];
        for (int i = 1; i < list.length; i++) {
            if (minValue > list[i]) {
                minValue = list[i];
            }
        }
        return minValue;
    }
}
