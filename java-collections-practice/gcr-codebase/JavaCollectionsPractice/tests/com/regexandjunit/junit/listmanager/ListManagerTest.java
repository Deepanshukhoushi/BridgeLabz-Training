package com.regexandjunit.junit.listmanager;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    void testAddElement() {
        listManager.addElement(list, 10);
        assertTrue(list.contains(10));
        assertEquals(1, list.size());
    }

    @Test
    void testRemoveElement() {
        list.add(10);
        list.add(20);

        listManager.removeElement(list, 10);

        assertFalse(list.contains(10));
        assertEquals(1, list.size());
    }

    @Test
    void testGetSize() {
        listManager.addElement(list, 10);
        listManager.addElement(list, 20);

        int size = listManager.getSize(list);

        assertEquals(2, size);
    }
}
