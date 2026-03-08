package org.example.statistics;

import java.util.Random;

public class CemMilNumerosFactory {
    public static int[] gerarCemMilNumerosAleatorios(){
        int[]array = new int[100000];
        Random random = new Random();

        for (int i=0;i<array.length ;i++){
             array[i] = random.nextInt(100000)+1;
        }
        return array;
    }

    public static int[] gerarCemMilNumeros(){
        int []array= new int[100000];
        for(int i=0;i<array.length;i++){
            array[i]=i;
        }
        return array;
    }
}
