package Greenest;

public enum Vätska {
    MINERALVATTEN ("mineralvatten", 0.02, 0),
    KRANVATTEN ("kranvatten", 0, 0.5),
    PROTEINDRYCK ("proteindryck", 0.1, 0.2);

    public final String vätskaSträng;
    public final double vätskaBasMängd;
    public final double vätskaMängdModifierare;

    Vätska (String v, double m, double mm){
        vätskaSträng = v;
        vätskaBasMängd = m;
        vätskaMängdModifierare = mm;
    }
}
