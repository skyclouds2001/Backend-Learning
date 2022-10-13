package org.sky.mybatis;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Mapper {

    List<Course> selectCourse();

    List<Course> selectCourseWithName(String name);

    List<Course> selectCourseWithNameAndTea(@Param("cou_name") String name, @Param("cou_tea") String tea);
    List<Course> selectCourseWithNameAndTea(Course course);
    List<Course> selectCourseWithNameAndTea(Map<String, String> map);

}
