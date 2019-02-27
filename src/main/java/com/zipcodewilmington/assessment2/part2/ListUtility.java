package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

    List<Integer> list;

    public ListUtility() {
        list = new ArrayList<>();
    }

    public Boolean add(Integer i) {
            return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> tempArrList = new ArrayList();
        for (Integer i : list) {
            if (!tempArrList.contains(i)) {
                tempArrList.add(i);
            }
        }
        return tempArrList; //TODO : test 3 is failing due to incorrect test case
    }

    public String join() {
        String listAsString = list.toString();
        return listAsString.substring(1, listAsString.length() - 1);
    }

    public Integer mostCommon() {
        return ArrayUtility.mostCommon(ArrayUtility.returnIntegeArray((ArrayList<Integer>) list));
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
