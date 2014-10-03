package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

  Fraction fraction;
    
    @Before
    public void before(){
        fraction = new Fraction(3,4);
    }

    @Test
    public void testFractionIntInt() {
        assertEquals(3, fraction.getNumerator());
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    public void testFraction() {
        Fraction fr = new Fraction();
        assertEquals(1, fr.getNumerator());
        assertEquals(1, fr.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(0.75, fraction.decimal(), 10e-3);
    }
    
    @Test
    public void testIsPropia(){
        assertTrue(fraction.isPropia());
    }
    
    @Test
    public void testIsImpropia(){
        assertTrue(!fraction.isImpropia());
    }
    
    @Test
    public void testMultiplicar(){
        Fraction multiplo = new Fraction(2,2);        
        assertEquals(fraction.multiplicar(multiplo).getNumerator(), multiplo.getNumerator() * fraction.getNumerator(), 0.5);
        assertEquals(fraction.multiplicar(multiplo).getDenominator(), multiplo.getDenominator() * fraction.getDenominator(), 0.5);
    }

}
