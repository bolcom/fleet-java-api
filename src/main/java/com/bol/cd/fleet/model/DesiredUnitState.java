package com.bol.cd.fleet.model;

public class DesiredUnitState {

    private String name;
    private State desiredState;
    private byte[] fileContents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(State desiredState) {
        this.desiredState = desiredState;
    }

    public byte[] getFileContents() {
        return fileContents;
    }

    public void setFileContents(byte[] fileContents) {
        this.fileContents = fileContents;
    }
}
