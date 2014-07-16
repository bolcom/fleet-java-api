package com.bol.cd.fleet.model;

public class Unit {

    private String name;
    private String fileHash;
    private byte[] fileContent;
    private State desiredState;
    private State currentState;
    private String targetMachineID;
    private SystemdState systemd;

    public Unit() {
    }

    public Unit(String name, String fileHash, byte[] fileContent, State desiredState, State currentState, String targetMachineID, SystemdState systemd) {
        this.name = name;
        this.fileHash = fileHash;
        this.fileContent = fileContent;
        this.desiredState = desiredState;
        this.currentState = currentState;
        this.targetMachineID = targetMachineID;
        this.systemd = systemd;
    }

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

    public byte[] getFileContent() {
        return fileContent;
    }

    public void setFileContent(byte[] fileContent) {
        this.fileContent = fileContent;
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
