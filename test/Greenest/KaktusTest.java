package Greenest;

import junit.framework.TestCase;
import org.junit.Test;

public class KaktusTest extends TestCase {

    Växt igge = new Kaktus("Igge", 0.2);


    @Test
    public void testVätskemängdUträkning() {
        assert(igge.vätskemängdUträkning() == 0.02);
    }
}