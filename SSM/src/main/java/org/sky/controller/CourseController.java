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
    RequestResult getById(@PathVariable String id) {
        Course course = courseService.getById(id);
        boolean flag = course != null;
        return new RequestResult(flag ? RequestCode.SUCCESS : RequestCode.FAILURE, "", flag, course);
    }

    @GetMapping
    @ResponseBody
    RequestResult getAll() {
        List<Course> courses = courseService.getAll();
        boolean flag = courses != null;
        return new RequestResult(flag ? RequestCode.SUCCESS : RequestCode.FAILURE, "", flag, courses);
    }

    @PostMapping
    @ResponseBody
    RequestResult save(@RequestBody Course course) {
        boolean flag = courseService.save(course);
        return new RequestResult(flag ? RequestCode.SUCCESS : RequestCode.FAILURE, "", flag, null);
    }

    @PutMapping
    @ResponseBody
    RequestResult update(@RequestBody Course course) {
        boolean flag = courseService.update(course);
        return new RequestResult(flag ? RequestCode.SUCCESS : RequestCode.FAILURE, "", flag, null);
    }

    @DeleteMapping
    @ResponseBody
    RequestResult delete(@RequestBody String id) {
        boolean flag = courseService.delete(id);
        return new RequestResult(flag ? RequestCode.SUCCESS : RequestCode.FAILURE, "", flag, null);
    }

}
