package com.project1;

import com.service.Users;

public class UpdateUser {
    private String user;
    private String newData;
    Users testi = new Users();
    public String execute(){
        // testi = new GetBest();
        // testi.addBest();
        testi.updateBest(this.getUser(),this.getNewData());
        return "success";
    }
    public String getNewData() {
        return newData;
    }
    public void setNewData(String newData) {
        this.newData = newData;
    }
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
        System.out.print(this.getUser());
        // System.out.print(testi.getBestTut());
    }    
}
