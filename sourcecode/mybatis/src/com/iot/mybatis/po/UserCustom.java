package com.iot.mybatis.po;

/**
 * Created by Brian on 2016/2/24.
 */
public class UserCustom extends User {
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    private int uid;
    @Override
    public String toString(){
        return "username"+getUsername()+"birthday=" + getBirthday();
    }
}
