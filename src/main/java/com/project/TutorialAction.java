package com.project;


import java.util.ArrayList;

// import com.project.User;
public class TutorialAction {
    // private ArrayList<String> test;
    // public String execute(){
    //     User userObj = new User();
    //     // test = userObj.getUsers();
    //     setTest(userObj.getUsers());
    //     System.out.print("Hello from execute");
    //     System.out.print(test);
    //     return "success";
    // }
    // public void setTest(ArrayList<String> testi){
    //     this.test = testi;
    // }
    // public ArrayList<String> getTest(){
    //     return test;
    // }
    private ArrayList<String> userList;
    private String tempData;
    public ArrayList<String> getUserList() {
        userList.add("add");
        return userList;
    }
    public void setUserList(ArrayList<String> userList) {
        this.userList = userList;
    }
    public String getTempData() {
        return tempData;
    }
    public void setTempData(String tempData) {
        this.tempData = tempData;
        this.userList.add(tempData);
    }

}