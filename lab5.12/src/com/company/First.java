package com.company;

public class First {
    public static void main(String[] args) {
        int count = 0;
        int[] array = new int[49];
        for (int n = 1; n <= 99; n++) {
            if (n % 2 == 0) {
                array[count] = n;
                count++;
                System.out.println(n);
            }
        }
    }
}
