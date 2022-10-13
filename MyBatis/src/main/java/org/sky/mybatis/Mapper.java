package org.sky.mybatis;

import java.util.List;

public interface Mapper {

    List<Course> selectCourse();

    List<Course> selectCourseWithName(String name);

}
