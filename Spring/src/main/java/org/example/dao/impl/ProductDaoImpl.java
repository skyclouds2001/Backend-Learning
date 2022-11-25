package org.example.dao.impl;

import org.example.dao.ProductDao;
import org.springframework.stereotype.Component;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

    @Override
    public void save() {
        System.out.println("product dao save");
    }

}
