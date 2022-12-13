package org.sky.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.sky.config.SpringConfig;
import org.sky.domain.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class CourseServiceTest {

    @Autowired
    private CourseService courseService;

    @Test
    public void testGetById() {
        Course course = courseService.getById("ES202020");
        System.out.println(course);
    }

    @Test
    public void testGetAll() {
        List<Course> courses = courseService.getAll();
        System.out.println(courses);
    }

}
