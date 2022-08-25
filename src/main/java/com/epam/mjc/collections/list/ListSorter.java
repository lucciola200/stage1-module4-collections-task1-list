package com.epam.mjc.collections.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList);
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Integer intA = calculateFormula(Integer.parseInt(a));
        Integer intB = calculateFormula(Integer.parseInt(b));
        return intA - intB;
    }

    public int calculateFormula(int x){
        return (int) (Math.pow((5*x),2) + 3);
    }
}
