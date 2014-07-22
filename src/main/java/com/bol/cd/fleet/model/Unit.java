package com.bol.cd.fleet.model;

public class Unit {

    private String name;
    private String fileHash;
    private String fileContents;
    private State desiredState;
    private State currentState;
    private String targetMachineID;
    private SystemdState systemd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileHash() {
        return fileHash;
    }

    public void setFileHash(String fileHash) {
        this.fileHash = fileHash;
    }

    public String getFileContents() {
        return fileContents;
    }

    public void setFileContents(String fileContents) {
        this.fileContents = fileContents;
    }

    public State getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(State desiredState) {
        this.desiredState = desiredState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public String getTargetMachineID() {
        return targetMachineID;
    }

    public void setTargetMachineID(String targetMachineID) {
        this.targetMachineID = targetMachineID;
    }

    public SystemdState getSystemd() {
        return systemd;
    }

    public void setSystemd(SystemdState systemd) {
        this.systemd = systemd;
    }
}
