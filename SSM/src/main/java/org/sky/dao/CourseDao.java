package org.sky.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.sky.domain.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseDao {

    @Select("select * from course where cou_ser = #{id}")
    Course getById(String id);

    @Select("select * from course")
    List<Course> getAll();

    @Insert("insert into course (cou_name, cou_credit, cou_ser, cou_per, cou_tea, cou_term, cou_room) values(#{cou_name}, #{cou_credit}, #{cou_ser}, #{cou_per}, #{cou_tea}, #{cou_term}, #{cou_room})")
    int save(Course course);

    @Update("update course set cou_name = #{cou_name}, cou_credit = #{cou_credit}, cou_per = #{cou_per}, cou_tea = #{cou_tea}, cou_term = #{cou_term}, cou_room = #{cou_room} where cou_ser = #{cou_ser}")
    int update(Course course);

    @Delete("delete from course where cou_ser = #{id}")
    int delete(String id);

}
