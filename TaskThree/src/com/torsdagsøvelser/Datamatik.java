package com.torsdagsøvelser;

public class Datamatik {

    public static void main(String[] args) {
        Student student1 = new Student("Mark", 22, "isMale", " Datamatiker Team A");
        Student student2 = new Student("Hans", 23, "isMale", " Datamatiker Team A");
        Teacher teacher = new Teacher("Cecilie", 30, "isFemale");

        // Calling teachers name with a method
        teacher.teacherName();

        // Printing without any toString() methods
        System.out.println(student1.name + student1.datamatikerTeam);
        System.out.println(student2.name + student2.datamatikerTeam);
    }
}
