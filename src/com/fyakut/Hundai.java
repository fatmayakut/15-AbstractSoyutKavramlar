package com.fyakut;

public class Hundai extends Araba {
    private int bygrgucu;

    public int getBygrgucu() {
        return bygrgucu;
    }

    public void setBygrgucu(int bygrgucu) {
        this.bygrgucu = bygrgucu;
    }

    @Override
    public int saatBenzinyakma() {
        return getAgirlik()*3;
    }
}
