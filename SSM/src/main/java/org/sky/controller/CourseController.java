package org.sky.controller;

import org.sky.domain.Course;
import org.sky.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/{id}")
    @ResponseBody
    Course getById(@PathVariable String id) {
        return courseService.getById(id);
    }

    @GetMapping
    @ResponseBody
    List<Course> getAll() {
        return courseService.getAll();
    }

    @PostMapping
    @ResponseBody
    boolean save(@RequestBody Course course) {
        return courseService.save(course);
    }

    @PutMapping
    @ResponseBody
    boolean update(@RequestBody Course course) {
        return courseService.update(course);
    }

    @DeleteMapping
    @ResponseBody
    boolean delete(@RequestBody String id) {
        return courseService.delete(id);
    }

}
