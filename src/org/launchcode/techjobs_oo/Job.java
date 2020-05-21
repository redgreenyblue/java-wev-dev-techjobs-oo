package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if(name.isEmpty() && getEmployer().getValue().isEmpty() && getLocation().getValue().isEmpty() && getPositionType().getValue().isEmpty() && getCoreCompetency().getValue().isEmpty()) {
            return "OOPS! This job does not seem to exist.";
        }
        if(name.isEmpty()) name = "Data not available";
        if(getEmployer().getValue().isEmpty()) employer.setValue("Data not available");
        if(getLocation().getValue().isEmpty()) location.setValue("Data not available");
        if(getPositionType().getValue().isEmpty()) positionType.setValue("Data not available");
        if(getCoreCompetency().getValue().isEmpty()) coreCompetency.setValue("Data not available");
            return "\n" + "ID:  " + id + "\n" + "Name:  " + name + "\n" + "Employer:  " + employer + "\n" + "Location:  " + location + "\n" + "Position Type:  " + positionType + "\n" + "Core Competency:  " + coreCompetency + "\n";
    }
}
