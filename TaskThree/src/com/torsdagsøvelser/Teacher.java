package com.torsdagsøvelser;

public class Teacher {
    public String name;
    public int age;
    public String isFemale;

        // Teacher constructor
    public Teacher(String tmpName, int tmpAge, String tmpIsFemale) {
        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;
    }

    // Method for printing teachers name
    static void teacherName() {
        System.out.println("Cecilie");
    }
}
