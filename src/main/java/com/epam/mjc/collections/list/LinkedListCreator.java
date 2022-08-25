package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        int size = sourceList.size();

        for (int i = 0; i < size; i++) {
            int el = sourceList.get(i);
            if (el % 2 != 0) {
                linkedList.add(0, el);
            }else {
                linkedList.add(i, el);
            }
        }

        return linkedList;
    }
}
