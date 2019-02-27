package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal a, Animal b){
        return b.getSpeed() - a.getSpeed();
    }
}
