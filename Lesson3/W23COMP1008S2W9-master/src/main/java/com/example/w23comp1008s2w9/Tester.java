package com.example.w23comp1008s2w9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<Course> courses = DBUtility.getCoursesFromDB();
        System.out.println(courses);

//        ArrayList<Grade> grades = DBUtility.getGradesFromDB(100000002);
//        System.out.println(grades);

        Person person = new Person("Homer","Simpson",
                "742 Evergreen Terrace, Springfield, OH", LocalDate.of(1965,12,10));
        System.out.println(person);

//        Student student1 = new Student("Barney","Duff","Moe's Tavern",
//                                LocalDate.of(1972,02,28),200041234);
//
//        ArrayList<Grade> grades2 = new ArrayList<>();
//        grades.add(new Grade(200041235,20023,98));
//        Student student2 = new Student("Bart","Simpson","742 Evergreen Terrace, Springfield, OH",
//                                LocalDate.of(1982,03,19),200041235, grades2);
//
//        System.out.println("student 1: "+student1);
//        System.out.println("student 2: "+student2);

        ArrayList<Student> students = DBUtility.getStudentsFromDB();
        System.out.println(students);
    }
}
