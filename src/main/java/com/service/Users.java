package com.service;

import java.util.ArrayList;

public class Users {
    static ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> getBestTut(){
        // list.add("JAVA");
        return list;
    }
    
    public ArrayList<String> addBest(String data){
        list.add(data);
        System.out.print(list);
        return list;
    }
    public ArrayList<String> deleteBest(String data){
        list.remove(data);
        System.out.print(list);
        return list;
    }
    public ArrayList<String> updateBest(String data,String newData){
        if(list.contains(data)){
            list.remove(data);
            list.add(newData);
        }
        System.out.printf(data,list);
        return list;
    }
}
