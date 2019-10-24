package com.neu.cloud.datamodel;

import java.util.List;

public class Program {
    private long programId;
    private List<Course> courses;

    public Program() {
    }

    public Program(long programId, List<Course> courses) {
        this.programId = programId;
        this.courses = courses;
    }

    public long getProgramId() {
        return programId;
    }

    public void setProgramId(long programId) {
        this.programId = programId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
