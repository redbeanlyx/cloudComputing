package com.neu.cloud.service;

import com.neu.cloud.datamodel.Course;
import com.neu.cloud.datamodel.InMemoryDatabase;
import com.neu.cloud.datamodel.Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProgramsService {

    static HashMap<Long, Program> program_map = InMemoryDatabase.getProgramDB();

    public ProgramsService() {
    }

    public List<Program> getAllPrograms() {
        //Getting the list
        ArrayList<Program> list = new ArrayList<>();
        for (Program prof : program_map.values()) {
            list.add(prof);
        }
        return list ;
    }

    // Adding a program
    public void addProgram(long programId, List<Course> courses) {
        // Next Id
        long nextAvailableId = program_map.size() + 1;

        //Create a Program Object
        Program program = new Program(programId,courses);

        program_map.put(nextAvailableId, program);
    }
    // Adding a program
    public Program addProgram(Program program) {
        // Next Id
        long nextAvailableId = program_map.size() + 1;
        program.setProgramId(nextAvailableId);
        program_map.put(nextAvailableId, program);
        return program;
    }


    // Getting One program
    public Program getProgram(Long programId) {

        Program program = program_map.get(programId);
        System.out.println("Item retrieved:");
        System.out.println(program.toString());
        return program;
    }

    // Deleting a program
    public Program deleteProgram(Long programId) {
        Program deletedProgramDetail = program_map.get(programId);
        program_map.remove(programId);
        return deletedProgramDetail;
    }

    // Updating Program Info
    public Program updateProgramInformation(long programId, Program program) {
        Program oldProgramObject = program_map.get(programId);
        program_map.put(programId,program);
        return oldProgramObject;
    }



}