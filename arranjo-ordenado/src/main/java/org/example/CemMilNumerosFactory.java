package org.example;

import java.util.Random;

public class CemMilNumerosFactory {
    public int[] gerarCemMilNumeros(){
        int[]array = new int[100000];
        Random random = new Random();

        for (int i=0;i<array.length ;i++){
             array[i] = random.nextInt(100000)+1;
        }
        return array;
    }
}
