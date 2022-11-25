package org.example.dao.impl;

import org.example.dao.ProductDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestory;

@Component("productDao")
@Scope("singleton")
public class ProductDaoImpl implements ProductDao {

    @Override
    public void save() {
        System.out.println("product dao save");
    }

//    @PostConstruct
    public void init() {}

//    @PreDestory
    public void destroy() {}

}
