package org.example.array;


import java.util.function.Consumer;

public abstract class OrderedArray {
    protected int [] arranjo;
    protected int tamanho;
    protected int capacidade;

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

}
