package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        Boolean isGreaterThan5 = isGreaterThan5(valueToEvaluate);
        Boolean isLessThan7 = isLessThan7(valueToEvaluate);

        return isGreaterThan5.equals(isLessThan7);
    }

    public Boolean startsWith(String string, Character character) {
        String charToCompare = string.toLowerCase().substring(0,1);
        return character.toString().toLowerCase().equals(charToCompare);
    }
}
