package org.example;

public class AlgoritmoBaquitraquin {
    static int camiones = 3;
    static int capacidadMax = 20000;
    static boolean solucionEncontrada = false;

    public static boolean mudanzaRealizable(int[] pesos) {
        int[] solucion = new int[pesos.length];
        for (int i = 0; i < solucion.length; i++) {
            solucion[i] = -1;
        }
        if (backtrackMudanza(pesos, solucion, 0)) {
            System.out.println("Si es posible realizar la mudanza con 3 camiones");
            System.out.println("El reparto de los objetos en los 3 camiones es:");
            for (int i = 0; i < solucion.length; i++) {
                System.out.print((solucion[i]+1) + ", ");
            }
            System.out.println();
            return true;
        } else {
            System.out.println("No es posible realizar la mudanza con 3 camiones");
            return false;
        }
    }

    public static boolean backtrackMudanza(int[] pesos, int[] solucion, int indiceObjeto) {
        if (indiceObjeto == pesos.length) {
            return validarAsignacion(pesos, solucion);
        }

        for (int i = 0; i < camiones; i++) {
            if (esNodoVivo(pesos, solucion, indiceObjeto,i)) {
                solucion[indiceObjeto] = i;
                if (backtrackMudanza(pesos, solucion, indiceObjeto + 1)) {
                    return true;
                }
                solucion[indiceObjeto] = -1;
            }
        }
        return false;
    }

    public static boolean esNodoVivo(int[] pesos, int[] solucion, int indiceObjeto, int camion) {
        int suma1 = 0;
        for (int j = 0; j < indiceObjeto; j++) {
            if (solucion[j] == camion) {
                suma1 += pesos[j];
            }

        }return ((suma1 + pesos[indiceObjeto]) <= capacidadMax);
    }

    public static boolean validarAsignacion (int[] pesos, int[] solucion){
        int sumaf1 = 0;
        int sumaf2 = 0;
        int sumaf3 = 0;

        for (int i = 0; i < solucion.length; i++) {
            if (solucion[i] == 0) {
                sumaf1 += pesos[i];
            } else if (solucion[i] == 1) {
                sumaf2 += pesos[i];
            } else if (solucion[i] == 2) {
                sumaf3 += pesos[i];
            }
            if (sumaf1 > capacidadMax || sumaf2 > capacidadMax || sumaf3 > capacidadMax) {
                return false;
            }
        }
        return true;
    }
}
