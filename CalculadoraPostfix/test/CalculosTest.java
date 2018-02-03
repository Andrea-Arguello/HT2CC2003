/*
 * CalculosTest.java
 * 30/01/2018
 * Andrea Arguello 17801
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrea Arguello 17801
 */
public class CalculosTest {
    
    public CalculosTest() {
    }

    /**
     * Test of operar method, of class Calculos.
     */
    @Test
    public void testOperar(){
        Calculos test = new Calculos();
        double actual = test.operar("7 9 * 3 1 - *");
        double expected=126;
        assertEquals(expected, actual, 0);}
    
}
