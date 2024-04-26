package org.example;

public class AlgoritmoDinamico {

    private static final int PESO_MAXIMO = 15000;
    public static int mochiladinamica(int[] pesos)
    {

        int[] cogidos= new int[pesos.length+1];
        int[] beneficios = new int[pesos.length];
        int beneficiotoal = 0;
        for (int i = 0; i < pesos.length; i++) {
            beneficios[i]=pesos[i]*6;
        }

        int[][] adyacencia = new int[pesos.length+1][PESO_MAXIMO+1];
        for (int i = 0; i <= pesos.length; i++) {
            for (int j = 0; j <= PESO_MAXIMO; j++) {
                adyacencia[i][j] = 0;
            }
        }
        for (int i = 1; i <= pesos.length; i++) {
            for (int j = 1; j <= PESO_MAXIMO; j++) {
                if (pesos[i-1] <= j) {
                    adyacencia[i][j] = Math.max(adyacencia[i-1][j], adyacencia[i-1][j-pesos[i-1]]+beneficios[i-1]);
                    beneficiotoal= adyacencia[i][j];
                } else {
                    adyacencia[i][j] = adyacencia[i-1][j];
                }
            }
        }
        System.out.println("\n");
        System.out.println("El beneficio maximo es: "+adyacencia[pesos.length][PESO_MAXIMO]);
        if(adyacencia[pesos.length][PESO_MAXIMO]!=0) {
            int i = pesos.length;
            int j = PESO_MAXIMO;
            int num = 0;
            while (i > 0 && j > 0) {
                if (adyacencia[i][j] != adyacencia[i - 1][j] && adyacencia[i][j] != 0) {
                    cogidos[num] = pesos[i - 1];
                    j = j - pesos[i - 1];
                    num++;
                }
                i--;
            }
            System.out.print("Objetos cargados en el camión son los de peso: ");
            num = 0;
            try{
                while (cogidos[num] != 0) {
                    System.out.print("\t" + cogidos[num]);
                    num++;
                }
            }catch(ArrayIndexOutOfBoundsException e){

            }

        }

        return beneficiotoal;
    }
}