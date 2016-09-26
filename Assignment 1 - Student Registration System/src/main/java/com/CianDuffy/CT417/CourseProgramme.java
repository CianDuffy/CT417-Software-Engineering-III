package com.CianDuffy.CT417;

import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by cianduffy on 26/09/2016.
 */
public class CourseProgramme {
    private String name;
    private String courseCode;
    private DateTime startDateTime;
    private DateTime endDateTime;
    private ArrayList<Module> modules;

    public CourseProgramme(String nameString, String courseCodeString, DateTime startDateTime, DateTime endDateTime, ArrayList<Module> modulesArrayList) {
        this.name = nameString;
        this.courseCode = courseCodeString;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.modules = modulesArrayList;
    }

    // Accessor Methods
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public DateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(DateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public DateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(DateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
