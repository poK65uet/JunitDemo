package com.example;

public final class Week4 {
    Week4() {
    }

    /**
     * 
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * 
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
            mn = Math.min(mn, arr[i]);
        return mn;
    }

    /**
     * 
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI = weight / (height * height);
        BMI =  (double) Math.round(BMI * 10) / 10;
        if (BMI < 18.5) {
            return "Thiếu cân";
        } else if (BMI < 23) {
            return "Bình thường";
        } else if (BMI < 25) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }

    public static void main(String[] args) {
        
    }
}
