package org.example.dao.impl;

import org.example.dao.BookDao;
import org.example.dao.ManagerDao;

public class ManagerDaoImpl implements ManagerDao {

    private final BookDao bookDao;

    private final int id;

    public ManagerDaoImpl(BookDao bookDao, int id) {
        this.bookDao = bookDao;
        this.id = id;
    }

    @Override
    public void save() {
        System.out.println("ManagerDao");
        bookDao.save();
        System.out.println(this.id);
    }

}
