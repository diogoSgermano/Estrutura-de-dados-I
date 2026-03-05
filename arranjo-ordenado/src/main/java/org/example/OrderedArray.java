package org.example;


import java.util.function.Consumer;

public class OrderedArray {
    private int [] arranjo;
    private int tamanho;
    private int capacidade;

    public OrderedArray(int capacidade) {
        this.capacidade=capacidade;
        arranjo= new int[capacidade];
        tamanho=0;
    }

    public void percorrer(Consumer<Integer> consumer){
        for(int i=0;i<tamanho;i++){
            consumer.accept(arranjo[i]);
        }
    }

    public void inserir(int... va){
        for (int valor:va){
            if (capacidade==tamanho){
                System.out.println("Array cheio");
                return;
            }
            int i = tamanho-1;

            while (i>=0 && arranjo[i]>valor) {
                arranjo[i + 1] = arranjo[i];
                i--;
            }
            arranjo[i+1]=valor;
            tamanho++;
        }


    }


}
