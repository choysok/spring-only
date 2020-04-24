package com.page.controller.User;

import java.io.Serializable;

public class User implements Serializable {

    private  Integer   age;
    private  Double money;


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", money=" + money +
                '}';
    }
}
