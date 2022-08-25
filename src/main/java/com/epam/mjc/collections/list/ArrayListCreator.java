package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= sourceList.size() / 3; i++) {
            int index = 3 * i - 1;
            list.add(sourceList.get(index));
            list.add(sourceList.get(index));
        }
        return list;
    }
}
