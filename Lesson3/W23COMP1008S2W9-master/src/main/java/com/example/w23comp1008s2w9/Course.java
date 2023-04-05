package com.example.w23comp1008s2w9;

public class Course {
    private int crn;
    private String courseCode, courseName;

    public Course(int crn, String courseCode, String courseName) {
        setCrn(crn);
        setCourseCode(courseCode);
        setCourseName(courseName);
    }

    /**
     * A valid CRN has 5 numbers in it
     * @param crn
     */
    public void setCrn(int crn) {
        if (crn >= 10000 && crn <= 99999)
            this.crn = crn;
        else
            throw new IllegalArgumentException("CRN must be in the range 10000-99999");
    }

    /**
     * A valid course code has 4 upper case letters followed by 4 numbers
     * examples are: COMP 1008, MGMT 2003, etc..
     */
    public void setCourseCode(String courseCode)
    {
        //Regular Expressions (commonly called RegEx) allow us to check for a pattern
        //in a String
        String courseCodePattern = "[A-Z]{4}\\s[0-9]{4}";
        courseCode = courseCode.toUpperCase();
        if (courseCode.matches(courseCodePattern))
            this.courseCode = courseCode;
        else
            throw new IllegalArgumentException("Course code must have 4 letters a space and 4 digits (i.e. COMP 1008)");
    }

    /**
     * A course name should describe what the course is about
     */
    public void setCourseName(String courseName)
    {
        courseName = courseName.trim();   //this removes leading and trailing white spaces
        if (courseName.length()>=2 && courseName.length()<=30)
            this.courseName = courseName;
        else
            throw new IllegalArgumentException("course name must be 2 to 30 characters in length");
    }

    public int getCrn() {
        return crn;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String toString()
    {
        return String.format("%d-%s-%s",crn,courseCode,courseName);
    }
}
