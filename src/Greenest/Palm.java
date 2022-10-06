package Greenest;

public class Palm extends Växt  {
    protected Vätska vätska = Vätska.KRANVATTEN;

    public Palm(String växtNamn, double längd) {
        super(växtNamn, längd);
    }

    public double vätskemängdUträkning(){
        return getLängd()*getVätska().vätskaMängdModifierare;
    }

    public Vätska getVätska() {
        return vätska;
    }
}


