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








/*
5.a Create a new class Datamatik or reuse the one you created earlier.
Add an array of Students with 10 elements in it. This should be a class variable (static).
From the main method, add 10 student instances to the array. Each student must have a unique reference.

5.b Create a function in Datamatik that takes in the array from 5.a as a parameter as well as an integer.
The function should return the field "name"
(the name of the student) and print it (the integer should be used as the index number of the student to be printed).
Call this method with different parameters (only the integer - not the array) from the main() of Datamatik.

5.c Create a similar function to that of 5.b, but instead of receiving the array and an integer, it receives the array and a string.
Loop through all elements in the array until you find the element with the name received as a parameter. Then return the index of that student.
Call this method with different names from the main method of Datamatik
*/