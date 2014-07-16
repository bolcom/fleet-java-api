package com.bol.cd.fleet.model;

import java.util.ArrayList;
import java.util.List;

public class UnitPage {

    private List<Unit> units = new ArrayList<>();

    public UnitPage(List<Unit> units) {
        this.units = units;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }
}
