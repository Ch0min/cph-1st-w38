package com.torsdagsøvelser;

public class Datamatik {
    // 5.a
    static Student[] students = new Student[10];

    public static void main(String[] args) {
        students[0] = new Student("Mark", 22, "Male", "Dat Team A", 0);
        students[1] = new Student("Jannik", 22, "Male", "Dat Team A", 1);
        students[2] = new Student("Cecilie", 23, "Female", "Dat Team A", 2);
        students[3] = new Student("Vilhelm", 24, "Male", "Dat Team A", 3);
        students[4] = new Student("Sofie", 21, "Female", "Dat Team A", 4);
        students[5] = new Student("Lotte", 24, "Female", "Dat Team A", 5);
        students[6] = new Student("Kevin", 23, "Male", "Dat Team A", 6);
        students[7] = new Student("Joakim", 22, "Male", "Dat Team A", 7);
        students[8] = new Student("Jesper", 24, "Male", "Dat Team A", 8);
        students[9] = new Student("Anne", 21, "Female", "Dat Team A", 9);

        // Calling methods from 5.b
        allStudents(students, 2);
        returnIndex(students, "Cecilie");
    }
     // 5.b
     // Making two methods to call the name of the students and index placements of student cards.
    public static String allStudents(Student[] students, int number) {
        String studentName = "";
        for (int i = 0; i < students.length; i++) {
            if (students[i].studentCard == number)
                studentName = students[i].name;
        }
        System.out.println("The name of the student of studentcard " + number + " :" + studentName);
        return(studentName);
    }
    // For student card placement
    public static int returnIndex(Student[] students, String studentName){
        int index = 0;

        for(int i = 0; i < students.length; i++){
            if (students[i].name == studentName){

                index = students[i].studentCard;
            }
        }
        System.out.println("Student card for " + studentName +  " is: "+ index);
        return index;
    }
}
