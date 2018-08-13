/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pila;

import Pilas.ListaPila;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jurueta
 */
public class PilaTest {
    
    public PilaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void testPushEnPilaVacia(){
        ListaPila<String> pila = new ListaPila<>();
        pila.push("Hola");
        assertEquals("El top no es igual al nodo creado", pila.getTop(), pila.peek());
        assertEquals("El top incial no es uno", pila.getSize(), 1);
        assertEquals("El link no es nulo", pila.getTop().getNext(), null);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
