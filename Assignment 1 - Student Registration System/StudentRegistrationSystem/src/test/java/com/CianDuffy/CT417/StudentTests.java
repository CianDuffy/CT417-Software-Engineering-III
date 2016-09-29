package com.CianDuffy.CT417;

import junit.framework.TestCase;

/**
 * Created by CianDuffy on 26/09/2016.
 * Unit tests for Student Class.
 */
public class StudentTests extends TestCase
{
    private Student testStudent;

    @Override
    protected void setUp()
    {
        ActionManager actionManager = ActionManager.getInstance();
        testStudent = new Student("Nick Faldo", actionManager.dateTimeFromString("01/01/1994"), "1234567");
    }

    public void testGetUsername()
    {
        String expectedUsername = "nickfaldo22";
        String actualUsername = testStudent.getUsername();

        assertEquals(expectedUsername, actualUsername);
    }

    public void testGetAge()
    {
        int expectedAge = 22;
        int actualAge = testStudent.getAge();

        assertEquals(expectedAge, actualAge);
    }
}
