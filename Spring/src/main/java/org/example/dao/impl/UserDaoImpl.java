package org.example.dao.impl;

import org.example.dao.UserDao;

public class UserDaoImpl implements UserDao {

    private int id;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void save() {
       System.out.println("UserDao");
    }

}
