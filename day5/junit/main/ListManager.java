package src.main.java.org.week4.day5.junit.main;

import java.util.List;

public class ListManager {
    // Method to add an element to the list
    public void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    // Method to remove an element from the list
    public void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element));
    }

    // Method to get the size of the list
    public int getSize(List<Integer> list) {
        return list.size();
    }
}