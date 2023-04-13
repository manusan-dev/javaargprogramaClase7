
package javaclase7;


import javaclase7.Carrito;
import javaclase7.ItemCarrito;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {
   

    @Test
    public void testGetNumeroCarrito() {
        System.out.println("getNumeroCarrito");
        Carrito instance = new Carrito();
        int expResult = 0;
        int result = instance.getNumeroCarrito();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAgregarItem() {
        System.out.println("agregarItem");
        ItemCarrito item = null;
        Carrito instance = new Carrito();
        instance.agregarItem(item);
        fail("The test case is a prototype.");
    }

    @Test
    public void testEliminarItem() {
        System.out.println("eliminarItem");
        ItemCarrito item = null;
        Carrito instance = new Carrito();
        instance.eliminarItem(item);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        Carrito instance = new Carrito();
        double expResult = 0.0;
        double result = instance.getDescuento();
        assertEquals(expResult, result, 0);
        fail("The test case is a prototype.");
    }
    
}
