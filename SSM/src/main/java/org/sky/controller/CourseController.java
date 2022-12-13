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
    Result getById(@PathVariable String id) {
        Course course = courseService.getById(id);
        boolean flag = course != null;
        return new Result(flag ? Code.SUCCESS : Code.FAILURE, "", flag, course);
    }

    @GetMapping
    @ResponseBody
    Result getAll() {
        List<Course> courses = courseService.getAll();
        boolean flag = courses != null;
        return new Result(flag ? Code.SUCCESS : Code.FAILURE, "", flag, courses);
    }

    @PostMapping
    @ResponseBody
    Result save(@RequestBody Course course) {
        boolean flag = courseService.save(course);
        return new Result(flag ? Code.SUCCESS : Code.FAILURE, "", flag, null);
    }

    @PutMapping
    @ResponseBody
    Result update(@RequestBody Course course) {
        boolean flag = courseService.update(course);
        return new Result(flag ? Code.SUCCESS : Code.FAILURE, "", flag, null);
    }

    @DeleteMapping
    @ResponseBody
    Result delete(@RequestBody String id) {
        boolean flag = courseService.delete(id);
        return new Result(flag ? Code.SUCCESS : Code.FAILURE, "", flag, null);
    }

    public static class Result {

        private Object data;

        private Integer code;

        private String message;

        private Boolean success;

        public Result() {}

        public Result(Integer code, String message, Boolean success, Object data) {
            this.data = data;
            this.code = code;
            this.message = message;
            this.success = success;
        }

    }

    public static class Code {

        public static final int SUCCESS = 0;

        public static final int FAILURE = 1;

    }

}
