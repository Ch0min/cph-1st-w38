package com.torsdagsøvelser;

public class Student {
    public String name;
    public int age;
    public String isFemale;
    public String datamatikerTeam;
    public int studentCard;

    // Student constructor
    public Student(String tmpName, int tmpAge, String tmpIsFemale, String tmpDatamatikerTeam, int tmpStudentCard) {
        this.name = tmpName;
        this.age = tmpAge;
        this.isFemale = tmpIsFemale;
        this.datamatikerTeam = tmpDatamatikerTeam;
        this.studentCard = tmpStudentCard;

    }
}
