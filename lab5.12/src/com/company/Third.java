package com.company;

public class Third {
    public static void main(String[] args) {
        int[] massif1 = new int[5];
        int[] massif2 = new int[5];
        int[] massif3 = new int[5];
        int mas1 = 0;//можна було б ще робити змінні double
        int mas2 = 0;//але я до цього дійшла коли почала виводити
        int mas3 = 0;//тому в мене не точне значення а приблизне
        for (int n = 0 ; n < 5; n++) {
            massif1[n] = (int) Math.round (Math.random() * 5);
            mas1 = mas1 + massif1[n];
            System.out.print(massif1[n] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < 5; i++) {
            massif2[i] = (int) Math.round (Math.random() * 5);
            mas2 = mas2 + massif2[i];
            System.out.print(massif2[i] + " ");
        }
        System.out.println();
        for (int i = 0 ; i < 5; i++){
            massif3[i] = (int) Math.round (Math.random() * 5);
            mas3 = mas3 + massif3[i];
            System.out.print(massif3[i] + " ");
        }
        System.out.println();
        System.out.println("Середнє першого масиву: " + (mas1 /= 5));
        System.out.println("Середнє другого масиву: " + (mas2 /= 5));
        System.out.println("Середнє третього масиву: " + (mas3 /= 5));
        if (mas1 == mas2)
            System.out.println("mas1 == mas2");
        if (mas1 < mas2)
            System.out.println("mas1 < mas2");
        if (mas1 > mas2)
            System.out.println("mas1 > mas2");
        if (mas1 == mas3)
            System.out.println("mas1 == mas3");
        if (mas1 < mas3)
            System.out.println("mas1 < mas3");
        if (mas1 > mas3)
            System.out.println("mas1 > mas3");
        if (mas2 == mas3)
            System.out.println("mas2 == mas3");
        if (mas2 < mas3)
            System.out.println("mas2 < mas3");
        if (mas2 > mas3)
            System.out.println("mas2 > mas3");

    }
}
