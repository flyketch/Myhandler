package com.flyketch.myhandler;

import cn.bmob.v3.BmobUser;

/**
 * Created by flycompany on 2016/3/24 16:03.
 * E-mail: flycompany@icloud.com
 */
public class Company extends BmobUser {
    private String name;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
