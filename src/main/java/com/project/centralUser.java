package com.project;

import java.util.ArrayList;

public class centralUser {
    private ArrayList<String> userList;
    private String tempData;

    public ArrayList<String> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<String> userList) {
        this.userList = userList;
    }
    public String getTempData() {
        return tempData;
    }
    public void setTempData(String tempData) {
        this.userList.add(tempData);
        this.tempData = tempData;
    }

    

}
