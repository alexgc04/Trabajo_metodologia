package org.example;

import java.util.Arrays;

public class Algoritmo {
    public static int Algoritmo(Double[] pesos) {
        int preciofinal = 0, i = 0;
        double pesomax = 10000.00;
        boolean pesomaxalcanzado = false, quedanproductos = true;


        Arrays.sort(pesos);

        while (!pesomaxalcanzado && quedanproductos) {
            if (i != pesos.length) {
                if (pesomax > pesos[i]) {
                    pesomax = pesomax - pesos[i];
                    preciofinal = preciofinal + 40;
                    System.out.println("El producto de peso " + pesos[i] + " ha sido cargado al camion, el precio actual es de " + preciofinal + " y el peso maximo restante es de " + pesomax + " kg");
                    i++;
                } else {
                    pesomaxalcanzado = true;
                    System.out.println("El peso maximo ha sido alcanzado");
                }
            } else {
                quedanproductos = false;
                System.out.println("No hay mas productos");
            }
        }
        return preciofinal;

    }

}
