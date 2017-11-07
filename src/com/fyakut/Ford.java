package com.fyakut;

public class Ford extends Araba {
    public int jantKlnlk;

    public int getJantKlnlk() {
        return jantKlnlk;
    }

    public void setJantKlnlk(int jantKlnlk) {
        this.jantKlnlk = jantKlnlk;
    }

    @Override
    public int saatBenzinyakma() {
        return getAgirlik()*2;
    }
}
