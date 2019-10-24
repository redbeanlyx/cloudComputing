package com.neu.cloud.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.neu.cloud.datamodel.InMemoryDatabase;
import com.neu.cloud.datamodel.Professor;

public class ProfessorsService {

    static HashMap<Long, Professor> prof_Map = InMemoryDatabase.getProfessorDB();

    public ProfessorsService() {
    }

    // Getting a list of all professor
    // GET "..webapi/professors"
    public List<Professor> getAllProfessors() {
        //Getting the list
        ArrayList<Professor> list = new ArrayList<>();
        for (Professor prof : prof_Map.values()) {
            list.add(prof);
        }
        return list ;
    }

    // Adding a professor
    public void addProfessor(String firstName, String lastName, String department, Date joiningDate) {
        // Next Id
        long nextAvailableId = prof_Map.size() + 1;

        //Create a Professor Object
        Professor prof = new Professor(firstName+lastName, firstName , lastName,
                department, joiningDate.toString());

        prof_Map.put(nextAvailableId, prof);
    }
    // Adding a professor
    public Professor addProfessor(Professor professor) {
        // Next Id
        long nextAvailableId = prof_Map.size() + 1;
        prof_Map.put(nextAvailableId, professor);
        return professor;
    }


    // Getting One Professor
    public Professor getProfessor(String profId) {

        //Simple HashKey Load
        Professor prof2 = prof_Map.get(Long.parseLong(profId));
        System.out.println("Item retrieved:");
        System.out.println(prof2.toString());

        return prof2;
    }

    // Deleting a professor
    public Professor deleteProfessor(Long profId) {
        Professor deletedProfDetails = prof_Map.get(profId);
        prof_Map.remove(profId);
        return deletedProfDetails;
    }

    // Updating Professor Info
    public Professor updateProfessorInformation(long profId, Professor prof) {
        Professor oldProfObject = prof_Map.get(profId);
        prof_Map.put(profId,prof);
        return oldProfObject;
    }

    // Get professors in a department
    public List<Professor> getProfessorsByDepartment(String department) {
        //Getting the list
        ArrayList<Professor> list = new ArrayList<>();
        for (Professor prof : prof_Map.values()) {
            if (prof.getDepartment().equals(department)) {
                list.add(prof);
            }
        }
        return list ;
    }

    // Get professors for a year with a size limit

}