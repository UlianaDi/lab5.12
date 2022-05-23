package com.company;

public class Forth {
    public static void main(String[] args) {
        int[] massif1 = new int[10];
        int[] massif2 = new int[10];
        int[] massif3 = new int[10];

        for (int n = 0; n < 10; n++) {
            massif1[n] = (int) Math.round(Math.random() * 10);
            System.out.print(massif1[n] + " ");
        }  System.out.println();

        for (int n = 0; n < 10; n++) {
            massif2[n] = (int) Math.round(Math.random() * 10);
            System.out.print(massif2[n] + " ");
        } System.out.println();

        for (int n = 0; n < 10; n++){
            massif3[n] = massif1[n] + massif2[n];
            System.out.print(massif3[n] + " ");
        }
    }
}
