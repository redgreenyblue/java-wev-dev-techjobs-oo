package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobObjOne;
    Job jobObjTwo;
    Job jobObjThree;

    @Before
    public void jobTestObj() {
        jobObjOne = new Job("test job", new Employer("test emp"), new Location("test loc"), new PositionType("test pos"), new CoreCompetency("test comp"));
        jobObjTwo = new Job("abc job", new Employer("abc emp"), new Location("abc loc"), new PositionType("abc pos"), new CoreCompetency("abc comp"));
        jobObjThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(jobObjTwo.getId() - jobObjOne.getId() == 1, true);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(jobObjThree.getName().equals("Product tester"));
        assertTrue(jobObjThree.getEmployer().getValue().equals("ACME"));
        assertTrue(jobObjThree.getLocation().getValue().equals("Desert"));
        assertTrue(jobObjThree.getPositionType().getValue().equals("Quality control"));
        assertTrue(jobObjThree.getCoreCompetency().getValue().equals("Persistence"));
    }
}