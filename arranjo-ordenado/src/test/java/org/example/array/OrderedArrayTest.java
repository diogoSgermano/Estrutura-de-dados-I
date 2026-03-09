package org.example.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class OrderedArrayTest {

    private OrderedArrayASC array; // usando ASC só pra conseguir testar os métodos da classe pai

    @BeforeEach
    void setUp() {
        array = new OrderedArrayASC(5);
    }

    @Test
    void percorrerArrayVazio() {
        List<Integer> visitados = new ArrayList<>();
        array.percorrer(visitados::add);
        assertTrue(visitados.isEmpty());
    }

    @Test
    void percorrerArrayComElementos() {
        array.inserirASC(10, 20, 30);
        List<Integer> visitados = new ArrayList<>();
        array.percorrer(visitados::add);
        assertEquals(List.of(10, 20, 30), visitados);
    }

    @Test
    void removerElementoQueExiste() {
        array.inserirASC(10, 20, 30);
        assertTrue(array.remover(20));
        assertEquals(2, array.tamanho);
        assertArrayEquals(new int[]{10, 30, 0, 0, 0}, array.arranjo);
    }

    @Test
    void tentarRemoverElementoQueNaoExiste() {
        array.inserirASC(10, 20, 30);
        assertFalse(array.remover(50));
        assertEquals(3, array.tamanho);
        assertArrayEquals(new int[]{10, 20, 30, 0, 0}, array.arranjo);
    }

    @Test
    void tentarRemoverDeArrayVazio() {
        assertFalse(array.remover(10));
        assertEquals(0, array.tamanho);
    }

    @Test
    void removerPrimeiroElemento() {
        array.inserirASC(10, 20, 30);
        assertTrue(array.remover(10));
        assertEquals(2, array.tamanho);
        assertArrayEquals(new int[]{20, 30, 0, 0, 0}, array.arranjo);
    }

    @Test
    void removerUltimoElemento() {
        array.inserirASC(10, 20, 30);
        assertTrue(array.remover(30));
        assertEquals(2, array.tamanho);
        assertArrayEquals(new int[]{10, 20, 0, 0, 0}, array.arranjo);
    }

    @Test
    void removerQuandoTemElementoRepetido() {
        array = new OrderedArrayASC(10); // aumentei a capacidade pra caber tudo
        array.inserirASC(10, 20, 10, 30); // fica [10, 10, 20, 30, ...]
        assertTrue(array.remover(10)); // remove só a primeira ocorrência
        assertEquals(3, array.tamanho);
        assertArrayEquals(new int[]{10, 20, 30, 0, 0, 0, 0, 0, 0, 0}, array.arranjo);
    }
}