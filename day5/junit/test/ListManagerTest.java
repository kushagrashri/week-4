package src.main.java.org.week4.day5.junit.test;

import src.main.java.org.week4.day5.junit.main.ListManager;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ListManagerTest {
    private ListManager listManager;
    private List<Integer> list;

    @Before
    public void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        listManager.addElement(list, 5);
        assertEquals("List size should be 1 after adding an element", 1, listManager.getSize(list));
        assertTrue("List should contain the added element", list.contains(5));
    }

    @Test
    public void testRemoveElement() {
        listManager.addElement(list, 5);
        listManager.removeElement(list, 5);
        assertFalse("List should not contain the removed element", list.contains(5));
        assertEquals("List size should be 0 after removing the element", 0, listManager.getSize(list));
    }

    @Test
    public void testGetSize() {
        assertEquals("Initial list size should be 0", 0, listManager.getSize(list));
        listManager.addElement(list, 10);
        assertEquals("List size should be 1 after adding an element", 1, listManager.getSize(list));
    }
}