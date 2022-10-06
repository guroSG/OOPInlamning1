package Greenest;

public class KöttätandeVäxt extends Växt {
    protected Vätska vätska = Vätska.PROTEINDRYCK;

    public KöttätandeVäxt(String växtNamn, double längd) {
        super(växtNamn, längd);
    }

    public double vätskemängdUträkning() {
        return getVätska().vätskaBasMängd + (getVätska().vätskaMängdModifierare * getLängd());
    }

    public Vätska getVätska() {
        return vätska;
    }
}
