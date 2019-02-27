package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Integer arrayLength = array.length;
        return (arrayLength % 2 == 0);
    }

    public Integer[] range(int start, int stop) {
        ArrayList<Integer> newList = new ArrayList<>();

        for(int i = start; i <= stop ;i++){
            newList.add(i);
        }
        return newList.toArray(new Integer[newList.size()]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[0] * array[1];
    }
}
