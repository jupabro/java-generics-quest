package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GenericListTest {
    private GenericList<Integer> integerList;

    @BeforeEach
    public void setUp() {
        integerList = new GenericList<>();
    }

    @Test
    public void testAddAndGet() {
        integerList.add(1);
        integerList.add(2);
        assertEquals(1, integerList.get(0));
        assertEquals(2, integerList.get(1));
    }

    @Test
    public void testSize() {
        integerList.add(1);
        integerList.add(2);
        assertEquals(2, integerList.size());
    }

    @Test
    public void testNullValue() {
        integerList.add(null);
        assertNull(integerList.get(0));
    }
}