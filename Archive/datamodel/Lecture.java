package com.neu.cloud.datamodel;

import java.util.List;

public class Lecture {
    private long lectureId;
    private List<String> notes;
    private List<String> materials;

    public Lecture() {

    }
    public Lecture(long lectureId) {
        this.lectureId = lectureId;
    }

    public Lecture(long lectureId, List<String> notes, List<String> materials) {
        this.lectureId = lectureId;
        this.notes = notes;
        this.materials = materials;
    }

    public void addNote(String note){
        notes.add(note);
    }
    public void addMaterial(String material){
        materials.add(material);
    }
    public long getLectureId() {
        return lectureId;
    }

    public void setLectureId(long lectureId) {
        this.lectureId = lectureId;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    public List<String> getMaterials() {
        return materials;
    }

    public void setMaterials(List<String> materials) {
        this.materials = materials;
    }
}
