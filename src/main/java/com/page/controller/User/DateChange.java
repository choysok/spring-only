package com.page.controller.User;

import java.util.Date;

public class DateChange {

    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "DateChange{" +
                "birthday=" + birthday +
                '}';
    }
}
