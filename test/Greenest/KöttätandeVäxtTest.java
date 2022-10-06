package Greenest;

import junit.framework.TestCase;
import org.junit.Test;

public class KöttätandeVäxtTest extends TestCase {

    Växt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);


    @Test
    public void testVätskemängdUträkning() {
        assert(meatloaf.vätskemängdUträkning() == 0.24);
    }
}