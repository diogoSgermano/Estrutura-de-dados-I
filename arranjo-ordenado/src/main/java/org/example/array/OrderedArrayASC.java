package org.example.array;


public class OrderedArrayASC extends OrderedArray {

        public OrderedArrayASC(int capacidade){
            super(capacidade);
        }

    public void inserirASC(int... valores){
        for (int valor:valores) {
            if (tamanho == capacidade){
                System.out.println("Array cheio");
                return;
            }

            int i = tamanho - 1;


            while (i >= 0 && arranjo[i] > valor){
                arranjo[i + 1] = arranjo[i];
                i--;
            }

            arranjo[i + 1] = valor;
            tamanho++;
        }
    }


}
