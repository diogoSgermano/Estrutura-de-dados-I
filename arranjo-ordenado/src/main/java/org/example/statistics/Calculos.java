package org.example.statistics;

public class Calculos {
    public static double calcularMediaTempo(long[]execucoes){
        long soma=0;
        for (long e:execucoes){
            soma+=e;
        }

        return (double) soma/execucoes.length;
    }

    public static double calcularDesvioPadrao(long[] tempos){

        double media = calcularMediaTempo(tempos);
        double soma = 0;

        for(long tempo : tempos){
            soma += Math.pow(tempo - media, 2);
        }

        return Math.sqrt(soma / tempos.length);
    }
}
