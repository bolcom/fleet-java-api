package com.bol.cd.fleet.model;

public class SystemdState {

    private String loadState;
    private String activeState;
    private String subState;
    private String machineID;

    public SystemdState() {
    }

    public SystemdState(String loadState, String activeState, String subState, String machineID) {
        this.loadState = loadState;
        this.activeState = activeState;
        this.subState = subState;
        this.machineID = machineID;
    }

    public String getLoadState() {
        return loadState;
    }

    public void setLoadState(String loadState) {
        this.loadState = loadState;
    }

    public String getActiveState() {
        return activeState;
    }

    public void setActiveState(String activeState) {
        this.activeState = activeState;
    }

    public String getSubState() {
        return subState;
    }

    public void setSubState(String subState) {
        this.subState = subState;
    }

    public String getMachineID() {
        return machineID;
    }

    public void setMachineID(String machineID) {
        this.machineID = machineID;
    }
}
