package com.yueqian.bean;

public class UserInfo {
    //与数据库users对应
    private Integer user_id;
    private  String count;
    private String password;
    private String  user_Name;
    private Integer delFlag;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user_id=" + user_id +
                ", count='" + count + '\'' +
                ", password='" + password + '\'' +
                ", user_Name='" + user_Name + '\'' +
                ", delFlag=" + delFlag +
                '}';
    }
}
