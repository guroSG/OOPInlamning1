package Greenest;

import javax.swing.*;

public abstract class Växt implements VätskeKrävande {
    private double längd;
    private String växtNamn;

    public double getLängd() {
        return längd;
    }

    public String getVäxtNamn(){
        return växtNamn;
    }

    public Växt(String växtNamn, double längd) {
        this.växtNamn = växtNamn;
        this.längd = längd;
    }

    public void skrivUtVäxtensServering() {
        JOptionPane.showMessageDialog(null, växtNamn + " ska få " + vätskemängdUträkning() + " liter " + getVätska().vätskaSträng);
    }
}
