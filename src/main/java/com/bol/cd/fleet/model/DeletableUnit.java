package com.bol.cd.fleet.model;

public class DeletableUnit {

    private String name;
    private byte[] fileContents;

    public DeletableUnit() {
    }

    public DeletableUnit(String name, byte[] fileContents) {
        this.name = name;
        this.fileContents = fileContents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getFileContents() {
        return fileContents;
    }

    public void setFileContents(byte[] fileContents) {
        this.fileContents = fileContents;
    }
}
