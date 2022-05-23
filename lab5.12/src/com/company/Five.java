package com.company;

public class Five {
    public static void main(String[] args) {
        int x[] = new int[15];
        int y = 0;
        for (int n = 0; n < 15; n++) {
            x[n] = (int) Math.round(Math.random() * 10);
            System.out.print(x[n] + " ");}
        System.out.println();
        for (int n = 0; n < 15; n++) {
            int u = x[n] % 2;
            if (u == 0) {
                y++;
                System.out.print(x[n] + " ");}}
        System.out.println();
        System.out.println("Кількість парних елементів: " + y);
    }
}
