package com.CianDuffy.CT417;

import org.joda.time.DateTime;
import org.joda.time.Period;
import java.util.Date;

/**
 * Created by cianduffy on 26/09/2016.
 */
public class Student {

    private String name;
    private Date DOB;
    private String ID;

    // Constructor

    public Student(String name, Date DOB, String ID) {
        this.name = name;
        this.DOB = DOB;
        this.ID = ID;
    }

    // Accessor Methods

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        int age;
        DateTime currentDateTime = new DateTime();
        DateTime DOBDateTime = new DateTime(DOB);
        Period periodBetweenDOBAndNow = new Period(DOBDateTime, currentDateTime);

        age = periodBetweenDOBAndNow.getYears();
        return age;
    }
    
    public String getUsername() {
        String usernameString = this.name.toLowerCase();
        usernameString = usernameString.replaceAll("\\s", "");

        int age = getAge();

        if (age > 0)
        {
            usernameString += String.valueOf(age);
        }

        return usernameString;
    }
}

