package Greenest;

public class Kaktus extends Växt {
    protected Vätska vätska = Vätska.MINERALVATTEN;

    public Kaktus(String växtNamn, double längd) {
        super(växtNamn, längd);
    }

    public double vätskemängdUträkning() {
        return getVätska().vätskaBasMängd;
    }

    public Vätska getVätska() {
        return vätska;
    }
}