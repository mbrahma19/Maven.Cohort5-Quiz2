package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Router {

    private TreeMap<String, String> treeMap;

    public Router(){
        this.treeMap = new TreeMap<>();
    }

    public void add(String path, String controller) {
        treeMap.put(path,controller);
    }

    public Integer size() {
        return treeMap.size();
    }

    public String getController(String controller) {
        for(Map.Entry<String,String> k : treeMap.entrySet()){
            if(k.getValue().equals(controller)){
                return k.getKey();
            }
        }
        return treeMap.get(controller);
    } //TODO asking to pass in path but it actually needs controller

    public void update(String path, String studentController) {
        remove(path);
        add(path, studentController);
    }

    public void remove(String path) {
        treeMap.remove(path);
    }

    public String toString(){
        String returnString = "";
        for(Map.Entry<String,String> k : treeMap.entrySet()){
            returnString += k.getKey() + " -> " + k.getValue() + "\n";
        }
        return returnString;
    }
}
