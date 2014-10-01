package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    DecimalCollection collection;

    @Before
    public void testBefore(){
        collection = new DecimalCollection();
        collection.add(1.5);
        collection.add(2.23);
    }
    
    @Test
    public void testAddAndSize() {
        assertEquals(2, collection.size());
    }

    @Test
    public void testSum() {
        assertEquals(3.73, collection.sum(), 10e-3);
    }

    @Test
    public void testHigher() {
        assertEquals(2.23, collection.higher(), 10e-3);
    }


}
