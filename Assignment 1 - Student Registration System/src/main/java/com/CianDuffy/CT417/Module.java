package com.CianDuffy.CT417;

import java.util.ArrayList;

/**
 * Created by cianduffy on 26/09/2016.
 */
public class Module {
    private String name;
    private String ID;
    private ArrayList<Student> students;

    public Module(String name, String ID, ArrayList<Student> students) {
        this.name = name;
        this.ID = ID;
        this.students = students;
    }

    // Accessor Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
