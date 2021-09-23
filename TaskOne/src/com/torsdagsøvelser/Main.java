package com.torsdagsøvelser;

public class Main {

    // 1.a
    public static void main(String[] args) {
        // calling 1.b
        emptyLine();
        // calling 1.c
        helloSchool("Hello School");
        // calling 1.d
        myNameAge("Mark", 22);
    }

    // 1.b
    static void emptyLine() {
        System.out.println("_____");
    }

    // 1.c
    static void helloSchool(String s) {
        //s = "Hello School";
        System.out.println(s);
    }

    // 1.d
    static void myNameAge(String name, int age) {
        //name = "Mark";
        //age = 22;
        System.out.print("My name is " + name + ", I am " + age + " years old");
    }
}
