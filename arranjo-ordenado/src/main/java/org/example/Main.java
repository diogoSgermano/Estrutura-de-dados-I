package org.example;

public class Main {

    public static void main(String[] args) {

        CemMilNumerosFactory numerosFactory = new CemMilNumerosFactory();
        OrderedArray arranjo = new OrderedArray(100000);

        int[] numeros = numerosFactory.gerarCemMilNumeros();

        long T1 = System.nanoTime();

        arranjo.inserir(numeros);

        long T2 = System.nanoTime();

        long tempoTotal = T2 - T1;

        double tempoMs = tempoTotal / 1_000_000.0;

        System.out.println("Tempo em ms: " + tempoMs);
    }
}