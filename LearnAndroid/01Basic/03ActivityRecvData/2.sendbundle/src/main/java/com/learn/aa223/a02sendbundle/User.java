package com.learn.aa223.a02sendbundle;

import java.io.Serializable;

/**
 * Created by aa223 on 2016/10/1.
 */

public class User implements Serializable {


    private String name;
    private  int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }


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
