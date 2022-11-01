package org.example.service.impl;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {

    private BookDao bookDao;

    public BookServiceImpl() {}

    @Override
    public void save() {
        System.out.println("BookService save");
        bookDao.save();
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

}
