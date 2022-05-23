package com.company;

public class Second {
    public static void main(String[] args) {
        int[] array = new int[20];
        int n;
        for (n = 0; n < array.length; n++) {
            array[n] = (int) (Math.random() * 10);
            System.out.print(array[n] + " ");
        }System.out.println();
        for (n = 0; n < array.length; n++) {
            if (n%2 == 0) {
                System.out.print(array[n] + " ");
            } else {
                System.out.print(0 + " ");
            }

        }
    }
}