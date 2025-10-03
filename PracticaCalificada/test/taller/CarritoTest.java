package taller;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarritoTest {

        private Carrito carrito;

@Test
    public void testObtenerTotalInicial() {
        assertEquals(0, carrito.obtenerTotal());
    }

    @Test
    public void testObtenerTotalDespuesDeAgregar() {
        carrito.agregarProducto(50);
        carrito.agregarProducto(30);
        assertEquals(80, carrito.obtenerTotal());
    }

    @Test
    public void testVaciarCarrito() {
        carrito.agregarProducto(200);
        carrito.vaciar();
        assertEquals(0, carrito.obtenerTotal());
    }

    @Test
    public void testVaciarCarritoVariasVeces() {
        carrito.agregarProducto(150);
        carrito.vaciar();
        carrito.vaciar(); 
        assertEquals(0, carrito.obtenerTotal());
    }
}

