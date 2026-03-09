package org.example.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderedArrayASCTest {

    private OrderedArrayASC array;

    @BeforeEach
    void setUp() {
        array = new OrderedArrayASC(5);
    }

    @Test
    void inserirUmNumeroNoArrayVazio() {
        array.inserirASC(5);
        assertEquals(1, array.tamanho);
        assertEquals(5, array.arranjo[0]);
    }

    @Test
    void inserirVariosNumerosDesordenados() {
        array.inserirASC(10, 5, 15);
        assertEquals(3, array.tamanho);
        // tem que ficar em ordem crescente
        assertArrayEquals(new int[]{5, 10, 15, 0, 0}, array.arranjo);
    }

    @Test
    void naoDeveInserirQuandoArrayEstiverCheio() {
        array.inserirASC(10, 20, 30, 40, 50);
        assertEquals(5, array.tamanho);

        // array cheio, o 5 nao pode entrar
        array.inserirASC(5);
        assertEquals(5, array.tamanho);
        assertArrayEquals(new int[]{10, 20, 30, 40, 50}, array.arranjo);
    }

    @Test
    void inserirNumerosRepetidos() {
        array.inserirASC(10, 20, 10);
        assertEquals(3, array.tamanho);
        // os dois 10s ficam lado a lado
        assertArrayEquals(new int[]{10, 10, 20, 0, 0}, array.arranjo);
    }

    @Test
    void inserirUmNumeroNoMeio() {
        array.inserirASC(10, 30);
        array.inserirASC(20); // 20 tem que ir entre 10 e 30
        assertEquals(3, array.tamanho);
        assertArrayEquals(new int[]{10, 20, 30, 0, 0}, array.arranjo);
    }
}