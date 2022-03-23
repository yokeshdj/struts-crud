package com.project1;
import java.util.ArrayList;

import com.service.Users;
public class ListUser {
    private ArrayList<String> testi1;
    public String execute(){
        // System.out.print("Hello from execute");
        // return "success";
        Users testi = new Users();
        // String testi1 = testi.getBestTut();
        setTesti1(testi.getBestTut());
        System.out.print(testi1);
        return "success";
    }
    public ArrayList<String> getTesti1() {
        return testi1;
    }
    public void setTesti1(ArrayList<String> testi1) {
        this.testi1 = testi1;
    }
}
