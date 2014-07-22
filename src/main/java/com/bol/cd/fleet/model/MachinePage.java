package com.bol.cd.fleet.model;

import java.util.ArrayList;
import java.util.List;

public class MachinePage {

    private List<Machine> machines = new ArrayList<>();

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}
