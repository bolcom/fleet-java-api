package com.bol.cd.fleet.model;

public class Machine {

    private String id;
    private String primaryIP;
    private Metadata metadata;

    public Machine(String id, String primaryIP, Metadata metadata) {
        this.id = id;
        this.primaryIP = primaryIP;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrimaryIP() {
        return primaryIP;
    }

    public void setPrimaryIP(String primaryIP) {
        this.primaryIP = primaryIP;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
