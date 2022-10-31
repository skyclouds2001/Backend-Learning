package org.example.dao.impl;

import org.example.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("BookDao");
    }
}
