package com.CianDuffy.CT417;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Unit tests for Student Class.
 */
public class StudentTests extends TestCase {

    private Student testStudent;
    private Date DOB;

    protected void setUp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            DOB = simpleDateFormat.parse("01/01/1994");
            testStudent = new Student("Nick Faldo", DOB, "1234567");
        } catch(ParseException parseException) {
            parseException.printStackTrace();
        }
    }

    public void testGetUsername() {
        String expectedUsername = "nickfaldo22";
        String actualUsername = testStudent.getUsername();

        assertEquals(expectedUsername, actualUsername);
    }

    public void testGetAge() {
        int expectedAge = 22;
        int actualAge = testStudent.getAge();

        assertEquals(expectedAge, actualAge);
    }
}
