package Greenest;
import javax.swing.*;

public class huvudprogram {

    huvudprogram() {
        /*Här förekommer polymorfism, alla dessa objekt är av referenstypen Växt som pekar på respektive subklasser.
         Dessa ärver metoder både från superklassen och genom den även från interfacet VätskeKrävande
         */
        Växt laura = new Palm("Laura", 5);
        Växt putte = new Palm("Putte", 1);
        Växt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Växt igge = new Kaktus("Igge", 0.2);


        while (true) {
            String växtSomSkaFåVätska = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            /*Alla metoder som bearbetar objektens parametrar är inkapslade i klasser som är skiljda från huvudprogrammet.
            Resultaten skrivs ut här efter att huvudprogrammet kallar på dessa dolda metoder
             */
            if (växtSomSkaFåVätska.equalsIgnoreCase(laura.getVäxtNamn())) {
                laura.skrivUtVäxtensServering();
            } else if (växtSomSkaFåVätska.equalsIgnoreCase(putte.getVäxtNamn())) {
                putte.skrivUtVäxtensServering();
            } else if (växtSomSkaFåVätska.equalsIgnoreCase(meatloaf.getVäxtNamn())) {
                meatloaf.skrivUtVäxtensServering();
            } else if (växtSomSkaFåVätska.equalsIgnoreCase(igge.getVäxtNamn())) {
                igge.skrivUtVäxtensServering();
            } else {
                JOptionPane.showMessageDialog(null, "Växten \"" + växtSomSkaFåVätska + "\" finns inte på hotellet, var vänlig försök igen.");
            }
        }
    }
}