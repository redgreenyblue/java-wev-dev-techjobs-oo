package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job jobObjOne;
    Job jobObjTwo;
    Job jobObjThree;
    Job jobObjFour;
    Job jobObjFive;
    Job jobObjSix;
    Job jobObjSeven;

    @Before
    public void jobTestObj() {
        jobObjOne = new Job("test job", new Employer("test emp"), new Location("test loc"), new PositionType("test pos"), new CoreCompetency("test comp"));
        jobObjTwo = new Job("abc job", new Employer("abc emp"), new Location("abc loc"), new PositionType("abc pos"), new CoreCompetency("abc comp"));
        jobObjThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobObjFour = new Job("Jobby Job", new Employer("Master Employer"), new Location("Anywhere"), new PositionType("Worker Bee"), new CoreCompetency("Obedience"));
        jobObjFive = new Job("Jobby Job", new Employer("Master Employer"), new Location("Anywhere"), new PositionType("Worker Bee"), new CoreCompetency("Obedience"));
        jobObjSix = new Job("", new Employer("Master Employer"), new Location("Anywhere"), new PositionType("Worker Bee"), new CoreCompetency("Obedience"));
        jobObjSeven = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
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

    @Test
    public void testJobsForEquality() {
        assertFalse(jobObjFour == jobObjFive);   
    }

    @Test
    public void testJobToStringLabelsBlankLines() {
        assertEquals(
    "\n" + "ID:  " + jobObjOne.getId() + "\n" +
            "Name:  " + jobObjOne.getName() + "\n" +
            "Employer:  " + jobObjOne.getEmployer() + "\n" +
            "Location:  " + jobObjOne.getLocation() + "\n" +
            "Position Type:  " + jobObjOne.getPositionType() + "\n" +
            "Core Competency:  " + jobObjOne.getCoreCompetency() + "\n",
            jobObjOne.toString());
    }

    @Test
    public void testJobEmptyField() {
        assertEquals(
    "\n" + "ID:  " + jobObjSix.getId() + "\n" +
            "Name:  " + "Data not available" + "\n" +
            "Employer:  " + jobObjSix.getEmployer() + "\n" +
            "Location:  " + jobObjSix.getLocation() + "\n" +
            "Position Type:  " + jobObjSix.getPositionType() + "\n" +
            "Core Competency:  " + jobObjSix.getCoreCompetency() + "\n",
            jobObjSix.toString());
    }

    @Test
    public void testJobDoesNotExist() {
        assertEquals("OOPS! This job does not seem to exist.", jobObjSeven.toString());
    }

}