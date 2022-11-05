package org.example.dao.impl;

import org.example.dao.BookDao;
import org.example.dao.ManagerDao;

public class ManagerDaoImpl implements ManagerDao {

    private final BookDao bookDao;

    private final int id;

    private int[] nums;

    public ManagerDaoImpl(BookDao bookDao, int id) {
        this.bookDao = bookDao;
        this.id = id;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }

    @Override
    public void save() {
        System.out.println("ManagerDao");
        bookDao.save();
        System.out.println(this.id);
        System.out.println(this.nums.length);
    }

}
