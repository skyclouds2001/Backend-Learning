package org.example.factory;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class BookDaoFactoryBean implements FactoryBean<BookDao> {

    @Override
    public BookDao getObject() {
        return new BookDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookDao.class;
    }

}
