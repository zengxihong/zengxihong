package com.followme.model;

/**
 * Created by ZengXihong 2019-04-13.
 */
public class User {
    private String userName;
    private Integer sex;
    private Integer age;

    public User(String userName, Integer sex, Integer age) {
        this.userName = userName;
        this.sex = sex;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
