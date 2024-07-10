package io.zipcoder;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
    }

    public Classroom(Student[] students) {
    }

    public Classroom() {
        students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        //help
        int sumOfScore = 0;

        for (Student elements : students) {
            sumOfScore += elements.getNumberOfExamsTaken();
        }
        return sumOfScore / students.length;
    }

    public void addStudent(Student student) {
        Student[] newStudentArr = new Student[students.length + 1];
        newStudentArr[newStudentArr.length - 1] = student;
        students = newStudentArr;
    }

//    public void removeStudent(String firstName, String lastName) {
//
//        int indexOfBadStudent = 0;
//
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].equals(firstName)) {
//                indexOfBadStudent = i;
//                break;
//            }
//        }
//        ArrayList<Student> students1 = new ArrayList<>(students);
//        students1.remove(firstName);
//        students1.add(students.length, null);
//        students = (Student[]) students1.toArray();
//    }


//    public Student[] getStudentsByScore(){
//
//
//
//        //student list studen get students by score
//        //for each loop
//        //instance variable maximum students
//
//
//
//
//    }


}
