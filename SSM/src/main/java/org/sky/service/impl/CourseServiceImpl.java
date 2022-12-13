package org.sky.service.impl;

import org.sky.dao.CourseDao;
import org.sky.domain.Course;
import org.sky.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public Course getById(String id) {
        return courseDao.getById(id);
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll();
    }

    @Override
    public boolean save(Course course) {
        return courseDao.save(course) > 0;
    }

    @Override
    public boolean update(Course course) {
        return courseDao.update(course) > 0;
    }

    @Override
    public boolean delete(String id) {
        return courseDao.delete(id) > 0;
    }

}
