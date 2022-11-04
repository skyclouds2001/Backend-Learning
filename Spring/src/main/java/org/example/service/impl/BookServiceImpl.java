package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.dao.ManagerDao;
import org.example.dao.UserDao;
import org.example.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private BookDao bookDao;

    private UserDao userDao;

    private ManagerDao managerDao;

    public BookServiceImpl() {}

    @Override
    public void save() {
        System.out.println("BookService save");
        bookDao.save();
        userDao.save();
        managerDao.save();
    }

    public void init() {
        System.out.println("BookService init");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("BookService set");
    }

    @Override
    public void destroy() {
        System.out.println("BookService destroy");
    }

    public void close() {
        System.out.println("BookService close");
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setManagerDao(ManagerDao managerDao) {
        this.managerDao = managerDao;
    }

}
