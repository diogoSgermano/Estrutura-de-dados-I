package org.example.array;

public class OrderedArrayDESC extends OrderedArray{
    public OrderedArrayDESC(int capacidade){
        super(capacidade);
    }


    public void inserirDESC(int... valores){

        for (int valor : valores){

            if (tamanho == capacidade){
                System.out.println("Array cheio");
                return;
            }

            int i = tamanho - 1;

            // lógica decrescente
            while (i >= 0 && arranjo[i] < valor){
                arranjo[i + 1] = arranjo[i];
                i--;
            }

            arranjo[i + 1] = valor;
            tamanho++;
        }
    }

}
