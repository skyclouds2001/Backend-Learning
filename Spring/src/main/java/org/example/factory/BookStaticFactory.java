package org.example.factory;

import org.example.dao.impl.BookDaoImpl;
import org.example.dao.BookDao;

public class BookStaticFactory {

    public static BookDao getBookDao () {
        return new BookDaoImpl();
    }

}
