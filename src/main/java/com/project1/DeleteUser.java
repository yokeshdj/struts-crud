package com.project1;

import com.service.Users;

public class DeleteUser {
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
        testi.deleteBest(this.getUser());
        // System.out.print(testi.getBestTut());
    }    
}
