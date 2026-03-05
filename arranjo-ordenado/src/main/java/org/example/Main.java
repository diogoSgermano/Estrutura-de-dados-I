package org.example;

import org.example.array.OrderedArrayASC;
import org.example.array.OrderedArrayDESC;

public class Main {

    public static void main(String[] args) {
        //1 TESTE ARRANJO ORDENADO DE FORMA CRESCENTE

        CemMilNumerosFactory numerosFactory = new CemMilNumerosFactory();
        OrderedArrayASC arranjoASC = new OrderedArrayASC(100000);

        //GERADOR DE NUMEROS
        int[] numeros = numerosFactory.gerarCemMilNumeros();

        //TEMPO INICIAL
        long T1 = System.nanoTime();

        arranjoASC.inserirASC(numeros);

        //TEMPO FINAL
        long T2 = System.nanoTime();

        //T2-T1 PARA MÉDIA
        long tempoTotalASC = T2 - T1;

        //CONVERSÃO DE MÉDIA PARA MS
        double tempoMs = tempoTotalASC/ 1_000_000.0;

        System.out.println("Tempo em ms: " + tempoMs);


        //2 TESTE ARRANJO ORDENADO DE FORMA DECRESCENTE
        OrderedArrayDESC arranjoDESC = new OrderedArrayDESC(100000);





    }
}