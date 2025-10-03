
package taller;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarritoIntegracionTest {

    private Carrito carrito;

    @Test
    public void testFlujoCompletoCarrito() {
        carrito.agregarProducto(100);
        carrito.agregarProducto(200);
        carrito.agregarProducto(50);

        assertEquals(350, carrito.obtenerTotal());

        carrito.vaciar();
        assertEquals(0, carrito.obtenerTotal());
    }
}


