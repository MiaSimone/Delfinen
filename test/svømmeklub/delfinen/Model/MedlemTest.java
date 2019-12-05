/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svømmeklub.delfinen.Model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miade
 */
public class MedlemTest {
    
    public MedlemTest() {
    }
    
    @Before
    public void setUp() {
    }

 
    /**
     * Test of getBeskæftigelse method, of class Medlem.
     */
    @Test
    public void testGetBeskæftigelse() {
        System.out.println("getBesk\u00e6ftigelse");
        Medlem instance = new Medlem("Jonas", 18, 2001, "lyngbyvej 421", "2800", 
            21421213, "junior", "passivt", "motionist");
        String expResult = "motionist";
        String result = instance.getBeskæftigelse();
        assertEquals(expResult, result);
    }

}