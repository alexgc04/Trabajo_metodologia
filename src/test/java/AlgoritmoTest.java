import org.example.Algoritmo;
import org.junit.Test;
import static org.junit.Assert.*;

public class AlgoritmoTest {
    @Test
    public void testAlgoritmo() {
        Double[] pesos= new Double[]{1000.00, 33.00, 411.00, 75.00, 2.35};
        assertEquals(200, Algoritmo.Algoritmo(pesos));
    }
    @Test
    public void testPrecioFinalProductos() {
        Double[] nuevosPesos = {200.00, 500.00, 700.00, 300.00,90000.00};
        assertEquals(160, Algoritmo.Algoritmo(nuevosPesos));
    }
    @Test
    public void testProd(){
        Double[] nuevosPesos = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0};
        assertEquals(100, Algoritmo.Algoritmo(nuevosPesos));
    }


}
