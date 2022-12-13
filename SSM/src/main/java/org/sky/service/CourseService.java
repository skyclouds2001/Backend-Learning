package org.sky.service;

import org.sky.domain.Course;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CourseService {

    /**
     * 根据ID获取课程
     * @param id 课程ID
     * @return 课程
     */
    Course getById(String id);

    /**
     * 获取全部课程
     * @return 课程列表
     */
    List<Course> getAll();

    /**
     * 更新课程
     * @param course 课程信息
     * @return 操作结果
     */
    boolean save(Course course);

    /**
     * 更新课程
     * @param course 课程信息
     * @return 操作结果
     */
    boolean update(Course course);

    /**
     * 删除课程
     * @param id 课程ID
     * @return 操作结果
     */
    boolean delete(String id);

}
