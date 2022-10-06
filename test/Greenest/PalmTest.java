package Greenest;

import junit.framework.TestCase;
import org.junit.Test;

public class PalmTest extends TestCase {

    Växt laura = new Palm("Laura", 5);
    Växt putte = new Palm("Putte", 1);

    @Test
    public void testVätskemängdUträkning() {
        assert(laura.vätskemängdUträkning() == 2.5);
        assert(putte.vätskemängdUträkning() == 0.5);
    }
}