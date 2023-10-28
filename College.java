package Encapsulation;

// Write a program to create student with private instance variable studnet_id; student_name
// and grades provide public getter and setter methods to access and modify the student_id
// and student_name variables. Howeever provide a method called add greades() that allows adding 
// a greades to the greade variables while performing validation. 

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class Student {
    private int student_id;
    private String student_name;

    private Double grades;

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public void addgrades()
    {
        if(grades==null)
        {
           grades = new ArrayList<>();
        }
        grades.addgrades;

    }

}

public class College {
    public static void main(String[] args) {

        Student student = new Student();

        student.setStudent_id(101);
        student.setStudent_name("Vishal Gorade");

        student.addgrades(92.8);
        student.addgrades(74.98);
        student.addgrades(89.90);

        int student_id = student.getStudent_id();
        String student_name = student.getStudent_name();
        List<Double> grades = student.getGrades();

        System.out.println("student_id" + student_id);
        System.out.println("student_name" + student_name);
        System.out.println("Grades" + grades);

    }

}
