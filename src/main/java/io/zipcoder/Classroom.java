package io.zipcoder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        Student[] emptyStudents = new Student[maxNumberOfStudents];
        students = emptyStudents;
    }

    public Classroom(Student[] students) {
    this.students = students;
    }

    public Classroom() {
        students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore() {
        //help
        //loop through average of students scores and sum up
        double sumOfScore = 0;

        for (Student elements : students) {
            sumOfScore = sumOfScore + elements.getAverageExamScore();
        }
        return sumOfScore / students.length;
    }

    public void addStudent(Student student) {
        Student[] newStudentArr = new Student[students.length + 1];
        System.arraycopy(this.students, 0, newStudentArr, 0, this.students.length);
        for (int i  = 0; i < newStudentArr.length; i++){
            if (newStudentArr[i] == null){
                newStudentArr[i] = student;
                students = newStudentArr;
                return;
            }
        }
        newStudentArr[newStudentArr.length-1] = student;
        students = newStudentArr;
    }

    public void removeStudent(String firstName, String lastName) {

        int indexOfBadStudent = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName)) {
                indexOfBadStudent = i;
                break;
            }
        }
        int newArrIndex = 0;
        Student[] newarr = new Student[students.length-1];
        for (int j = 0; j < students.length; j++){
            if (j == indexOfBadStudent){
                continue;
            }
            newarr[newArrIndex] = students[j];
            newArrIndex++;
        }
        List<Student> finalStudents = new ArrayList<>();
        for (int k  = 0; k < newarr.length; k++){
            if (newarr[k] == null){
                continue;
            }
            finalStudents.add(newarr[k]);
        }

        Student[] finalArr = new Student[finalStudents.size()];
       students =  finalStudents.toArray(finalArr);
        }



    public Student[] getStudentsByScore(){
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        return students;
    }



    }