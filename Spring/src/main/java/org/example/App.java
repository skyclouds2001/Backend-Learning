package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ctx.registerShutdownHook();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

        BookDao bookDao = (BookDao) ctx.getBean("bookDaoFactoryBean");
        bookDao.save();

        /* ***** Example ***** */

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);

        DataSource dataSource1 = (DataSource) ctx.getBean("dataSourceD");
        System.out.println(dataSource1);

        ctx.close();
    }

}
