package com.CianDuffy.CT417;

/**
 * Created by cianduffy on 26/09/2016.
 */
public class Module {
    private String name;
    private String ID;
    private Student[] students;

    public Module(String name, String ID, Student[] students) {
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

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
