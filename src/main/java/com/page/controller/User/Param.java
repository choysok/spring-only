package com.page.controller.User;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Param implements Serializable {

    private  String  username;
    private  Integer password;
    private  User user;

    private List<User> list;
    private Map<String,User> map;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Param{" +
                "username='" + username + '\'' +
                ", password=" + password +
                ", user=" + user +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
