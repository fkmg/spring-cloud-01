package com.sxt.bean;

import java.io.Serializable;

public class User implements Serializable {

    /**学生id**/
    private int userid;

    /**学生姓名**/
    private String username;

    /**学生年龄**/
    private int userage;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public User(int userid, String username, int userage) {
        this.userid = userid;
        this.username = username;
        this.userage = userage;
    }

    public User() {
    }
}
