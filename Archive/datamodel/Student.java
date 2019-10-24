package com.neu.cloud.datamodel;

import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private String image;
    private List<Course> coursesEnrolled;
    private String programName;

    public Student() {
    }

    public Student(String name, String studentId, String image, List<Course> coursesEnrolled, String programName) {
        this.name = name;
        this.studentId = studentId;
        this.image = image;
        this.coursesEnrolled = coursesEnrolled;
        this.programName = programName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Course> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(List<Course> coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }
}
