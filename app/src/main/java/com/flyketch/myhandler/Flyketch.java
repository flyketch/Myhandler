package com.flyketch.myhandler;

import cn.bmob.v3.BmobUser;

/**
 * Created by flycompany on 2016/3/24 15:32.
 * E-mail: flycompany@icloud.com
 */
public class Flyketch extends BmobUser {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
