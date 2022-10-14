package org.sky.mybatis;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface Mapper {

    List<Course> selectCourse();

    List<Course> selectCourseWithName(String cou_name);

    List<Course> selectCourseWithNameAndTea(@Param("cou_name") String cou_name, @Param("cou_tea") String cou_tea);
    List<Course> selectCourseWithNameAndTea(Course course);
    List<Course> selectCourseWithNameAndTea(Map<String, String> map);

    void addCourse(@Param("cou_name") String cou_name, @Param("cou_credit") String cou_credit, @Param("cou_ser") String cou_ser, @Param("cou_per") String cou_per, @Param("cou_tea") String cou_tea, @Param("cou_term") String cou_term, @Param("cou_room") String cou_room);

    int updateCourse(@Param("cou_name") String cou_name, @Param("cou_credit") String cou_credit, @Param("cou_ser") String cou_ser, @Param("cou_per") String cou_per, @Param("cou_tea") String cou_tea, @Param("cou_term") String cou_term, @Param("cou_room") String cou_room);

    void deleteCourse(String cou_ser);

    void deleteCourses(@Param("cou_ser_s") String[] cou_ser_s);

}
