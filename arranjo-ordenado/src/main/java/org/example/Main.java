package org.example;

import org.example.array.OrderedArrayASC;
import org.example.array.OrderedArrayDESC;
import org.example.statistics.CalculoTempoMedio;
import org.example.statistics.CemMilNumerosFactory;

public class Main {

    public static void main(String[] args) {

        //1 - INSERÇÃO ALEATÓRIA - CRESCENTE E DECRESCENTE


        //GERADOR DE NUMEROS ALEATORIOS
        int[] numerosAleatorios=CemMilNumerosFactory.gerarCemMilNumerosAleatorios();

        System.out.println("===== Inserção Aleatoria crescente =====");

        //INSERIR NUMEROS ALEATÓRIOS 100 VEZES - CRESCENTE
        long[] execCemVezesAleatorioASC = new long[100];
        for(int e=0;e<100;e++){
            OrderedArrayASC arranjoASC = new OrderedArrayASC(100000);
            long inicio=System.nanoTime();
            for (int numero : numerosAleatorios) {
                arranjoASC.inserirASC(numero);
            }
            long fim = System.nanoTime();

            execCemVezesAleatorioASC[e]=fim-inicio;
            System.out.println("Execução "+(e+1)+" :"+ execCemVezesAleatorioASC[e]+"ns");
        }

        // TEMPO MEDIO
        double tempoMedioInsercaoAleatorioASC= CalculoTempoMedio.calcularMediaTempo(execCemVezesAleatorioASC);

        // DESVIO PADRÃO
        double desvioPadraoInsercaoAleatorioASC= CalculoTempoMedio.calcularDesvioPadrao(execCemVezesAleatorioASC);
        System.out.println("Tempo médio da inserção crescente: "+tempoMedioInsercaoAleatorioASC/1_000_000+"ms");

        System.out.println("Desvio padrão: " + desvioPadraoInsercaoAleatorioASC / 1_000_000 + " ms");


        System.out.println();

        System.out.println("===== Inserção aleatoria decrescente =====");

        //inserção decrescente
        long[] execCemVezesAleatorioDESC = new long[100];
        for(int ex=0;ex<100 ; ex++){
            OrderedArrayDESC arranjoDESC = new OrderedArrayDESC(100000);
            long inicio2=System.nanoTime();
            for (int numero : numerosAleatorios) {
                arranjoDESC.inserirDESC(numero);
            }
            long fim2 = System.nanoTime();

            execCemVezesAleatorioDESC[ex]=fim2-inicio2;
            System.out.println("Execução "+(ex+1)+" :"+ execCemVezesAleatorioDESC[ex]+"ns");
        }
        double tempoMedioInsercaoAleatorioDESC= CalculoTempoMedio.calcularMediaTempo(execCemVezesAleatorioDESC);
        double desvioPadraoInsercaoAleatorioDESC = CalculoTempoMedio.calcularDesvioPadrao(execCemVezesAleatorioDESC);
        System.out.println("Tempo médio da inserção decrescente: "+tempoMedioInsercaoAleatorioDESC/1_000_000+"ms");
        System.out.println("Desvio padrão: " + desvioPadraoInsercaoAleatorioDESC / 1_000_000 + " ms");

        double tempoMedioInsercaoAleatorio=(tempoMedioInsercaoAleatorioASC+tempoMedioInsercaoAleatorioDESC)/2;
        double desvioPadraoInsercaoAleatorio=(tempoMedioInsercaoAleatorioASC+tempoMedioInsercaoAleatorioDESC)/2;
        System.out.println();

        System.out.println("===== Inserção sequencial crescente =====");

        // INSERÇÃO SEQUENCIAL - CRESCENTE E DECRESCENTE

        int[] numerosSequenciais = CemMilNumerosFactory.gerarCemMilNumeros();
        long[] execCemVezesSeqASC = new long[100];
        for(int e=0;e<100;e++){
            OrderedArrayASC arrayASC = new OrderedArrayASC(100000);
            long inicio= System.nanoTime();
            for (int numero:numerosSequenciais){
                arrayASC.inserirASC(numero);
            }
            long fim= System.nanoTime();
            execCemVezesSeqASC[e]=fim-inicio;

            System.out.println("Execução "+(e+1)+" :"+ execCemVezesSeqASC[e]+"ns");
        }
        double tempoMedioInsercaoSequencialASC= CalculoTempoMedio.calcularMediaTempo(execCemVezesSeqASC);
        double desvioPadraoInsercaoSequencialASC = CalculoTempoMedio.calcularDesvioPadrao(execCemVezesSeqASC);
        System.out.println("Tempo médio da inserção crescente: "+tempoMedioInsercaoSequencialASC/1_000_000+"ms");
        System.out.println("Desvio padrão: " + desvioPadraoInsercaoSequencialASC / 1_000_000 + " ms");

        System.out.println();

        System.out.println("===== Inserção sequencial decrescente =====");
        long[] execCemVezesSeqDESC = new long[100];
        for(int e=0;e<100;e++){
            OrderedArrayDESC arrayDESC = new OrderedArrayDESC(100000);
            long inicio= System.nanoTime();
            for (int numero:numerosSequenciais){
                arrayDESC.inserirDESC(numero);
            }
            long fim= System.nanoTime();
            execCemVezesSeqDESC[e]=fim-inicio;

            System.out.println("Execução "+(e+1)+" :"+ execCemVezesSeqDESC[e]+"ns");
        }
        double tempoMedioInsercaoSequencialDESC= CalculoTempoMedio.calcularMediaTempo(execCemVezesSeqDESC);
        double desvioPadraoInsercaoSequencialDESC = CalculoTempoMedio.calcularDesvioPadrao(execCemVezesSeqDESC);
        System.out.println("Tempo médio da inserção decrescente: "+tempoMedioInsercaoSequencialDESC/1_000_000+"ms");
        System.out.println("Desvio padrão: " + desvioPadraoInsercaoSequencialDESC / 1_000_000 + " ms");

        double tempoMedioInsercaoSequencial=(tempoMedioInsercaoSequencialASC+tempoMedioInsercaoSequencialDESC)/2;
        double desvioPadraoInsercaoSequencial=(desvioPadraoInsercaoSequencialASC+desvioPadraoInsercaoSequencialDESC)/2;

        System.out.println();

        //2 - EXCLUSÃO ALEATÓRIA - CRESCENTE E DECRESCENTE

//GERADOR DE NUMEROS ALEATORIOS
        numerosAleatorios = CemMilNumerosFactory.gerarCemMilNumerosAleatorios();

        System.out.println("===== Exclusão aleatória crescente =====");

//EXCLUIR NUMEROS ALEATORIOS 100 VEZES - CRESCENTE
        long[] execCemVezesExcAleatorioASC = new long[100];
        for(int e = 0; e < 100; e++){

            OrderedArrayASC arranjoASC = new OrderedArrayASC(100000);

            //INSERIR NUMEROS
            for(int numero : numerosAleatorios){
                arranjoASC.inserirASC(numero);
            }

            long inicio = System.nanoTime();

            for(int numero : numerosAleatorios){
                arranjoASC.remover(numero);
            }

            long fim = System.nanoTime();

            execCemVezesExcAleatorioASC[e] = fim - inicio;

            System.out.println("Execução "+(e+1)+" :"+ execCemVezesExcAleatorioASC[e]+"ns");
        }

//TEMPO MEDIO
        double tempoMedioExclusaoAleatoriaASC = CalculoTempoMedio.calcularMediaTempo(execCemVezesExcAleatorioASC);

//DESVIO PADRAO
        double desvioPadraoExclusaoAleatoriaASC = CalculoTempoMedio.calcularDesvioPadrao(execCemVezesExcAleatorioASC);

        System.out.println("Tempo médio da exclusão aleatória crescente: "+tempoMedioExclusaoAleatoriaASC/1_000_000+"ms");
        System.out.println("Desvio padrão: " + desvioPadraoExclusaoAleatoriaASC/1_000_000+" ms");

        System.out.println();



        System.out.println("===== Exclusão aleatória decrescente =====");

//EXCLUIR NUMEROS ALEATORIOS 100 VEZES - DECRESCENTE
        long[] execCemVezesExcAleatorioDESC = new long[100];
        for(int e = 0; e < 100; e++){

            OrderedArrayDESC arranjoDESC = new OrderedArrayDESC(100000);

            //INSERIR NUMEROS
            for(int numero : numerosAleatorios){
                arranjoDESC.inserirDESC(numero);
            }

            long inicio = System.nanoTime();

            for(int numero : numerosAleatorios){
                arranjoDESC.remover(numero);
            }

            long fim = System.nanoTime();

            execCemVezesExcAleatorioDESC[e] = fim - inicio;

            System.out.println("Execução "+(e+1)+" :"+ execCemVezesExcAleatorioDESC[e]+"ns");
        }

        double tempoMedioExclusaoAleatoriaDESC = CalculoTempoMedio.calcularMediaTempo(execCemVezesExcAleatorioDESC);
        double desvioPadraoExclusaoAleatoriaDESC = CalculoTempoMedio.calcularDesvioPadrao(execCemVezesExcAleatorioDESC);

        System.out.println("Tempo médio da exclusão aleatória decrescente: "+tempoMedioExclusaoAleatoriaDESC/1_000_000+"ms");
        System.out.println("Desvio padrão: " + desvioPadraoExclusaoAleatoriaDESC/1_000_000+" ms");

        double tempoMedioExclusaoAleatoria=(tempoMedioExclusaoAleatoriaASC+tempoMedioExclusaoAleatoriaDESC)/2;
        double desvioPadraoExclusaoAleatoria=(tempoMedioExclusaoAleatoriaASC+tempoMedioExclusaoAleatoriaDESC)/2;

        System.out.println();



        System.out.println("===== Exclusão sequencial crescente =====");

//GERADOR DE NUMEROS SEQUENCIAIS
        numerosSequenciais = CemMilNumerosFactory.gerarCemMilNumeros();

//EXCLUIR NUMEROS SEQUENCIAIS 100 VEZES - CRESCENTE
        long[] execCemVezesExcSeqASC = new long[100];
        for(int e = 0; e < 100; e++){

            OrderedArrayASC arranjoASC = new OrderedArrayASC(100000);

            for(int numero : numerosSequenciais){
                arranjoASC.inserirASC(numero);
            }

            long inicio = System.nanoTime();

            for(int numero : numerosSequenciais){
                arranjoASC.remover(numero);
            }

            long fim = System.nanoTime();

            execCemVezesExcSeqASC[e] = fim - inicio;

            System.out.println("Execução "+(e+1)+" :"+ execCemVezesExcSeqASC[e]+"ns");
        }

        double tempoMedioExclusaoSequencialASC= CalculoTempoMedio.calcularMediaTempo(execCemVezesExcSeqASC);
        double desvioPadraoExclusaoSequencialASC = CalculoTempoMedio.calcularDesvioPadrao(execCemVezesExcSeqASC);

        System.out.println("Tempo médio da exclusão sequencial crescente: "+tempoMedioExclusaoSequencialASC/1_000_000+"ms");
        System.out.println("Desvio padrão: " + desvioPadraoExclusaoSequencialASC/1_000_000+" ms");

        System.out.println();



        System.out.println("===== Exclusão sequencial decrescente =====");

//EXCLUIR NUMEROS SEQUENCIAIS 100 VEZES - DECRESCENTE
        long[] execCemVezesExcSeqDESC = new long[100];
        for(int e = 0; e < 100; e++){

            OrderedArrayDESC arranjoDESC = new OrderedArrayDESC(100000);

            for(int numero : numerosSequenciais){
                arranjoDESC.inserirDESC(numero);
            }

            long inicio = System.nanoTime();

            for(int numero : numerosSequenciais){
                arranjoDESC.remover(numero);
            }

            long fim = System.nanoTime();

            execCemVezesExcSeqDESC[e] = fim - inicio;

            System.out.println("Execução "+(e+1)+" :"+ execCemVezesExcSeqDESC[e]+"ns");
        }

        double tempoMedioExclusaoSequencialDESC = CalculoTempoMedio.calcularMediaTempo(execCemVezesExcSeqDESC);
        double desvioPadraoExclusaoSequencialDESC = CalculoTempoMedio.calcularDesvioPadrao(execCemVezesExcSeqDESC);

        System.out.println("Tempo médio da exclusão sequencial decrescente: "+tempoMedioExclusaoSequencialDESC/1_000_000+"ms");
        System.out.println("Desvio padrão: " + desvioPadraoExclusaoSequencialDESC+" ms");

        double tempoMedioExclusaoSequencial=(tempoMedioExclusaoSequencialASC+tempoMedioExclusaoSequencialDESC)/2;
        double desvioPadraoExclusaoSequencial=(desvioPadraoExclusaoSequencialASC+desvioPadraoExclusaoSequencialDESC)/2;
        System.out.println();
        //COMPARAÇÕES

        //  INSERÇÕES - INSERÇÕES ALEATORIAS:
        System.out.println("Comparação - Inserção Aleatoria [Crescente X Decrescente]");
        System.out.println("Tempo médio: "+tempoMedioInsercaoAleatorio);
        System.out.println("Desvio Padrão: "+desvioPadraoInsercaoAleatorio);
        System.out.println();

        //  INSERÇÕES - INSERÇÕES SEQUENCIAIS:
        System.out.println("Comparação - Inserção Sequencial [Crescente X Decrescente]");
        System.out.println("Tempo médio: "+tempoMedioInsercaoSequencial);
        System.out.println("Desvio padrao: "+desvioPadraoInsercaoSequencial);
        System.out.println();

        // EXCLUSÕES - EXCLUSÕES ALEATÓRIAS:
        System.out.println("Comparação - Exclusão Aleatoria [Crescente x Decrescente] ");
        System.out.println("Tempo médio: "+tempoMedioExclusaoAleatoria);
        System.out.println("Desvio padrão: "+desvioPadraoExclusaoAleatoria);
        System.out.println();

        // EXCLUSÕES - EXCLUSÕES SEQUENCIAIS:
        System.out.println("Comparação - Exclusão Sequencial [Crescente x Decrescente]");
        System.out.println("Tempo medio: "+ tempoMedioExclusaoSequencial);
        System.out.println("Desvio padrão: "+ desvioPadraoExclusaoSequencial);




    }
}