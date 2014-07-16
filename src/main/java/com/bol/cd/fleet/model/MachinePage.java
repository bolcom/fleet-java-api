package com.bol.cd.fleet.model;

import java.util.ArrayList;
import java.util.List;

public class MachinePage {

    private List<Machine> machines = new ArrayList<>();

    public MachinePage() {
    }

    public MachinePage(List<Machine> machines) {
        this.machines = machines;
    }

    public List<Machine> getMachines() {
        return machines;
    }

    public void setMachines(List<Machine> machines) {
        this.machines = machines;
    }
}
