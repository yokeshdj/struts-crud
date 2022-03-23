package com.project1;
// import java.util.ArrayList;

import com.service.Users;


public class AddUser {
    // private ArrayList<String> testi1;
    private String user;
    Users testi = new Users();
    public String execute(){
        // testi = new GetBest();
        // testi.addBest();
        return "success";
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
        System.out.print(this.getUser());
        testi.addBest(this.getUser());
        // System.out.print(testi.getBestTut());
    }
    // public ArrayList<String> getTesti1() {
    //     return testi1;
    // }
    // public void setTesti1(ArrayList<String> testi1) {
    //     this.testi1 = testi1;
    // }
}
