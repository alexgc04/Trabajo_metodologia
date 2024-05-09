package org.example;

public class AlgoritmoBaquitraquin {
    static int camiones = 3;
    static int capacidadMax = 20000;
    static boolean solucionEncontrada = false;

    public static boolean mudanzaRealizable(int[] pesos) {
        int[][] asignacionCamiones = new int[camiones][pesos.length];
        if (backtrackMudanza(pesos, asignacionCamiones, 0)) {
            System.out.println("Si es posible realizar la mudanza con " + camiones + " camiones");
            System.out.println("El reparto de los objetos en los " + camiones + " camiones es:");
            for (int i = 0; i < asignacionCamiones.length; i++) {
                System.out.print("Camión " + (i + 1) + ": ");
                for (int j = 0; j < asignacionCamiones[i].length; j++) {
                    if (asignacionCamiones[i][j] != 0) {
                        System.out.print(asignacionCamiones[i][j] + " ");
                    }
                }
                System.out.println();
            }
            return true;
        } else {
            System.out.println("No es posible realizar la mudanza con " + camiones + " camiones");
            return false;
        }
    }

    public static boolean backtrackMudanza(int[] pesos, int[][] asignacionActual, int indiceObjeto) {
        if (indiceObjeto == pesos.length) {
            return validarAsignacion(asignacionActual);
        }

        for (int i = 0; i < camiones; i++) {
            if (esNodoVivo(pesos, asignacionActual, indiceObjeto, i)) {
                asignacionActual[i][indiceObjeto] = pesos[indiceObjeto];
                if (backtrackMudanza(pesos, asignacionActual, indiceObjeto + 1)) {
                    return true;
                }
                asignacionActual[i][indiceObjeto] = 0;
            }
        }
        return false;
    }

    public static boolean esNodoVivo(int[] pesos, int[][] asignacionActual, int indiceObjeto, int camion) {
        int suma = 0;
        for (int j = 0; j < indiceObjeto; j++) {
            suma += asignacionActual[camion][j];
        }
        return (suma + pesos[indiceObjeto]) <= capacidadMax;
    }

    public static boolean validarAsignacion(int[][] asignacionActual) {
        for (int i = 0; i < camiones; i++) {
            int suma = 0;
            for (int j = 0; j < asignacionActual[i].length; j++) {
                suma += asignacionActual[i][j];
            }
            if (suma > capacidadMax) {
                return false;
            }
        }
        return true;
    }
}

