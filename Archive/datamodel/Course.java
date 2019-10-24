package com.neu.cloud.datamodel;

import java.util.List;

public class Course {
    private List<Lecture> lectures;
    private String board;
    private String roster;
    private List<String> studentIds;
    private String relatedProfessorId;
    private String TAIds;

    public Course(List<Lecture> lectures, String board, String roster, List<String> studentIds, String relatedProfessorId, String TAIds) {
        this.lectures = lectures;
        this.board = board;
        this.roster = roster;
        this.studentIds = studentIds;
        this.relatedProfessorId = relatedProfessorId;
        this.TAIds = TAIds;
    }

    public Course() {
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getRoster() {
        return roster;
    }

    public void setRoster(String roster) {
        this.roster = roster;
    }

    public List<String> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<String> studentIds) {
        this.studentIds = studentIds;
    }

    public String getRelatedProfessorId() {
        return relatedProfessorId;
    }

    public void setRelatedProfessorId(String relatedProfessorId) {
        this.relatedProfessorId = relatedProfessorId;
    }

    public String getTAIds() {
        return TAIds;
    }

    public void setTAIds(String TAIds) {
        this.TAIds = TAIds;
    }
}
