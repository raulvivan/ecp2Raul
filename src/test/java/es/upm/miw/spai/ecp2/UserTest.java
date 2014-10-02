package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

   User user;
    
    @Before
    public void testBefore(){
        user = new User(75869479, "raul", "vivanco");
    }

    @Test
    public void testUser() {
        assertEquals(75869479, user.getNumber());
        assertEquals("Raul", user.getName());
        assertEquals("Vivanco", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Raul Vivanco", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("R.", user.initials());
     }
    
    @Test
    public void testFullUpperName() {
        assertEquals("RAUL VIVANCO", user.fullUpperName());
        
    
    }

}
