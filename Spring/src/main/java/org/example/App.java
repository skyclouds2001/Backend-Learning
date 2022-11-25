package org.example;

import org.example.dao.BookDao;
import org.example.dao.ProductDao;
import org.example.dao.impl.ProductDaoImpl;
import org.example.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ctx.registerShutdownHook();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
        // BookService bookService = ctx.getBean("bookService", BookService.class)

        BookDao bookDao = (BookDao) ctx.getBean("bookDaoFactoryBean");
        bookDao.save();

        /* ***** Example ***** */

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

        DataSource dataSource1 = (DataSource) ctx.getBean("dataSourceD");
        System.out.println(dataSource1);

        ProductDao productDao = ctx.getBean("productDao", ProductDaoImpl.class);
        productDao.save();

        ctx.close();
    }

}
