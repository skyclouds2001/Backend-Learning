package org.example;

import org.example.dao.BookDao;
import org.example.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ctx.registerShutdownHook();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();

        BookDao bookDao = (BookDao) ctx.getBean("bookDaoFactoryBean");
        bookDao.save();

        ctx.close();
    }

}
