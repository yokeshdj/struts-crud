package com.project;

import java.util.ArrayList;

public class addUser {
    centralUser userObj;
    private ArrayList<String> userList;
    private String userName;
    public String execute(){
        userObj = new centralUser();
        // test = userObj.getUsers();
        // setTest(userObj.getUsers());
        // userObj.setTempData();
        // System.out.print("Hello from execute");
        // System.out.print(test);
        return "success";
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        userObj.setTempData(userName);
        this.userName = userName;
    }
    public ArrayList<String> getUserList() {
        return userList;
    }
    public void setUserList(ArrayList<String> userList) {
        this.userList = userList;
    }
}
