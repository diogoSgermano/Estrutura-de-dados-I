package org.example.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderedArrayDESCTest {

    private OrderedArrayDESC array;

    @BeforeEach
    void setUp() {
        array = new OrderedArrayDESC(5);
    }

    @Test
    void testInserirDESC_EmptyArray() {
        array.inserirDESC(5);
        assertEquals(1, array.tamanho);
        assertEquals(5, array.arranjo[0]);
    }

    @Test
    void testInserirDESC_MultipleElements() {
        array.inserirDESC(10, 5, 15);
        assertEquals(3, array.tamanho);
        assertArrayEquals(new int[]{15, 10, 5, 0, 0}, array.arranjo);
    }

    @Test
    void testInserirDESC_FullArray() {
        array.inserirDESC(50, 40, 30, 20, 10);
        assertEquals(5, array.tamanho);
        assertArrayEquals(new int[]{50, 40, 30, 20, 10}, array.arranjo);

        // Tentar inserir em um array cheio
        array.inserirDESC(5);
        assertEquals(5, array.tamanho); // O tamanho não deve mudar
        assertArrayEquals(new int[]{50, 40, 30, 20, 10}, array.arranjo); // O array não deve mudar
    }

    @Test
    void testInserirDESC_DuplicateElements() {
        array.inserirDESC(10, 20, 10);
        assertEquals(3, array.tamanho);
        assertArrayEquals(new int[]{20, 10, 10, 0, 0}, array.arranjo);
    }

    @Test
    void testInserirDESC_InsertIntoMiddle() {
        array.inserirDESC(30, 10);
        array.inserirDESC(20);
        assertEquals(3, array.tamanho);
        assertArrayEquals(new int[]{30, 20, 10, 0, 0}, array.arranjo);
    }
}
