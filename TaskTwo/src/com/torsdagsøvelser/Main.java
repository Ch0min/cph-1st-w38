package com.torsdagsøvelser;

public class Main {
    // 2.a variable
    public static boolean happy = true;

    public static void main(String[] args) {
        if (iAmHappy()) {
            System.out.println("I clap my hands");
        } else {
            System.out.println("I don't clap my hands");
        }
        // Calling the method from 2.b
        calculator(7, 10);
        // Calling the method from 2.c
        goodDay();
        // Calling the method from 2.d
        goodNight();
    }


    public static boolean iAmHappy() {
        // 2.a
        // Using an 'if statement'. setting happy equal to true
        if (happy == true) {
        }
        return true;
    }

    // 2.b
    static int calculator(int i, int j) {
        int sum = i + j;
        System.out.println(sum);
        return (sum);
    }

    // 2.c
    static String goodDay() {
        String str = "good day!";
        // Using the method ".toUpperCase" in println.
        System.out.println(str.toUpperCase());
        return str;
    }
    // 2.d
    static String goodNight() {
    String str = "good night!";
    // I'll use a substring to show my beginning index and ending index, so it will only print out my first letter "g".
        // I'll add another substring to remove the lowercase character 'g', and by doing so it will make space for my uppercase 'G'.
    String result = str.substring(0, 1).toUpperCase() + str.substring(1);
    System.out.println(result);
        return str;
    }
}
