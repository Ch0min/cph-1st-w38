package com.torsdagsøvelser;

public class Main {
    public static void main(String[] args) {
        // 4.a
        int[] arrayOfInts = {5, 10, 15};
        String[] arrayOfStrings = {"morning ", "day ", "night"};
        boolean[] arrayOfBooleans = {false, false, false};

        // Calling 4.b method
        myStrings(arrayOfStrings);
        // Calling 4.c method
        myInts(arrayOfInts);
        // Calling 4.d method
        averageValue(arrayOfInts);

    }

    // 4.b
    public static void myStrings(String[] arrayOfStrings) {
        for (int i = 0; i < 3; i++) {
            System.out.println(arrayOfStrings[i]);
        }
    }

    // 4.c
    public static int myInts(int[] arrayOfInts) {
        // Making a sum variable and a for loop to plus all 3 values together
        int sum = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            sum = sum + arrayOfInts[i];
        }
        System.out.println("The total sum is: " + sum);
        return (sum);
    }

    // 4.d
    public static int averageValue(int[] arrayOfInts) {
        int sum = 0;
        for (int i = 0; i < arrayOfInts.length; i++) {
            sum = sum + arrayOfInts[i];
        }
        float average = sum / arrayOfInts.length;
        System.out.println("The average number is: " + average);
        return (sum);
    }
}










