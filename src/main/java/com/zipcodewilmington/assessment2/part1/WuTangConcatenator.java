package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {

    private Integer input;
    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        Boolean result = false;
        if(input % 3 == 0){ result = true; }
        return result;
    }

    public Boolean isTang() {
        Boolean result = false;
        if(input % 5 == 0){ result = true; }
        return result;
    }

    public Boolean isWuTang() {
        Boolean result = false;
        if(isWu() && isTang()){ result = true; }
        return result;
    }
}
