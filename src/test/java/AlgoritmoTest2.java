import org.example.AlgoritmoDinamico;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class AlgoritmoTest2 {

    @Test
    public void testAlgoritmo() {
        int[] pesos = new int[]{10, 10, 10, 10};
        assertEquals(240, AlgoritmoDinamico.mochiladinamica(pesos));
    }

    @Test
    public void testAlgoritmo2() {
        int[] pesos = new int[]{10, 10, 3500000, 10};
        assertEquals(180, AlgoritmoDinamico.mochiladinamica(pesos));
    }

    @Test
    public void testAlgortimo3() {
        int[] pesos = new int[]{4600000, 30, 30, 45000000};
        assertEquals(360, AlgoritmoDinamico.mochiladinamica(pesos));
    }

    @Test
    public void testAlgoritmo4() {
        int[] pesos = new int[]{10, 1, 10, 10, 10, 10, 35000, 10, 340000, 10};
        assertEquals(500, AlgoritmoDinamico.mochiladinamica(pesos));
    }
}
