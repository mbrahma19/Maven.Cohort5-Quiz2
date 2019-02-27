package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayUtility {
    public static Integer[] merge(Integer[] array1, Integer[] array2) {
        ArrayList<Integer> array1AsList = returnAnIntegerList(array1);
        ArrayList<Integer> array2AsList = returnAnIntegerList(array2);

        array1AsList.addAll(array2AsList);
        return returnIntegeArray(array1AsList);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotatedArray = new Integer[array.length];

        for(int i = array.length-1 ; i >= 0; i--){
            int newPosition = i - index;
            if(newPosition >= 0 && newPosition < array.length){
                rotatedArray[newPosition] = array[i];
            }else if(newPosition < 0){
                rotatedArray[newPosition + array.length] = array[i];
            }
        }

        return rotatedArray;
    }

    public static Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        ArrayList<Integer> arrayList = returnAnIntegerList(merge(array1,array2));
        return Collections.frequency(arrayList,valueToEvaluate);
    }

    public static Integer mostCommon(Integer[] array) {
        ArrayList<Integer> arrayList = returnAnIntegerList(array);
        Integer mostOccurences = arrayList.get(0);

        for(Integer i : arrayList){
            if(Collections.frequency(arrayList,i) > Collections.frequency(arrayList,mostOccurences)){
                mostOccurences = arrayList.get(i);
            }
        }
        return mostOccurences;
    }

    public static ArrayList<Integer> returnAnIntegerList(Integer[] arrayToMorph){
        return new ArrayList<>(Arrays.asList(arrayToMorph));
    }

    public static Integer[] returnIntegeArray(ArrayList<Integer> arrayList){
        return arrayList.toArray(new Integer[arrayList.size()]);
    }

}
