package com.example.w23comp1008s2w9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Student extends Person{
    private int studentNum;
    private ArrayList<Grade> grades;

    public Student(int studentNum, String firstName, String lastName, String address, LocalDate birthday
                                                            , ArrayList<Grade> grades) {
        super(firstName, lastName, address, birthday);
        setStudentNum(studentNum);
        this.grades = grades;
    }


    /**
     *  This second constructor is an "overloaded" constructor.  That means there are 2 constructors, but because they
     *  have a different set of arguments, the system can differentiate between them and use the appropriate one
     */
    public Student( int studentNum,String firstName, String lastName, String address, LocalDate birthday) {
        super(firstName, lastName, address, birthday);
        setStudentNum(studentNum);
        this.grades = new ArrayList<>();
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        if (studentNum >= 100000000 && studentNum<=999999999)
            this.studentNum = studentNum;
        else
            throw new IllegalArgumentException("student number must be in the range 100000000-999999999");
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public String toString()
    {
        return String.format("%d-%s",studentNum,super.toString());
    }
}
