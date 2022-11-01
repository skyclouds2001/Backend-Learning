package org.example.factory;

import org.example.dao.BookDao;
import org.example.dao.impl.BookDaoImpl;

public class BookStaticFactory {

    public static BookDao getBookDao () {
        return new BookDaoImpl();
    }

}
