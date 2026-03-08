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

    public boolean remover(int numero){

        int posicao=-1;

        for(int i=0;i<tamanho;i++){
            if(arranjo[i]==numero){
                posicao=i;
                break;
            }
        }

        if(posicao==-1){
            return false;
        }

        for(int i=posicao;i<tamanho-1;i++){
            arranjo[i]=arranjo[i+1];
        }

        tamanho--;

        return true;
    }

}