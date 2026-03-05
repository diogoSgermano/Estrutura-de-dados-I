package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        ArranjoOrdernado arranjoOrdernado = new ArranjoOrdernado(10);

        arranjoOrdernado.inserir(6);
        arranjoOrdernado.inserir(9);
        arranjoOrdernado.inserir(3,5,6);

        arranjoOrdernado.percorrer(System.out::println);
//
//

    }
}
