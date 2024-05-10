import org.example.AlgoritmoBaquitraquin;
import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class AlgoritmoTest3 {

    @Test
    public void testAlgoritmo() {
        int[] pesosMercancia = new int[] {10000, 15000, 1700, 5000, 5000, 8000, 11090};
        assertTrue(AlgoritmoBaquitraquin.mudanzaRealizable(pesosMercancia));
    }

    @Test
    public void testAlgoritmo2() {
        int[] pesos2 = new int[] {10000, 10700, 7000, 9090, 8000, 6000, 4000, 5000};
        assertTrue(AlgoritmoBaquitraquin.mudanzaRealizable(pesos2));
    }

    @Test
    public void testAlgoritmo3() {
        int[] pesos4 = new int[] {19000, 19700, 16090, 5000};
        assertTrue(AlgoritmoBaquitraquin.mudanzaRealizable(pesos4));
    }

    @Test
    public void testAlgoritmo4() {
        int[] pesos5 = new int[] {19000, 10000, 70, 1000, 9700, 20000};
        assertTrue(AlgoritmoBaquitraquin.mudanzaRealizable(pesos5));
    }

    @Test
    public void testAlgortimo5() {
        int[] pesos6 = new int[] {1500, 1970, 333, 67, 4000, 1200, 300, 5000, 2400, 900, 8000, 6000, 5000, 4500, 6500, 2500, 5000, 5600};
        assertTrue(AlgoritmoBaquitraquin.mudanzaRealizable(pesos6));
    }

}


