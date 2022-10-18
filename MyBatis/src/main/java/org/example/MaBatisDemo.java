package org.example;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaBatisDemo {

    public void run() {
        try {
            String resource = "config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            try (SqlSession session = sqlSessionFactory.openSession()) {

                Mapper mapper = session.getMapper(Mapper.class);

                List<Course> courses = mapper.selectCourse();
                System.out.println();
                System.out.println(courses);
                System.out.println();

                List<Course> course = mapper.selectCourseWithName("数据结构");
                System.out.println();
                System.out.println(course);
                System.out.println();

                List<Course> course0 = mapper.selectCourseWithNameAndTea("数据结构", "张三");
                System.out.println();
                System.out.println(course0);
                System.out.println();

                Course c = new Course();
                c.setCouName("数据结构");
                c.setCouTea("张三");
                List<Course> course1 = mapper.selectCourseWithNameAndTea(c);
                System.out.println();
                System.out.println(course1);
                System.out.println();

                Map<String, String> m = new HashMap<>();
                m.put("cou_name", "数据结构");
                m.put("cou_tea", "张三");
                List<Course> course2 = mapper.selectCourseWithNameAndTea(m);
                System.out.println();
                System.out.println(course2);
                System.out.println();

                mapper.addCourse("概率论与数理统计", "3", "MS202018", "40", "王率", "3", "A509");
                System.out.println();
                System.out.println("MS202018");
                System.out.println();

                int update = mapper.updateCourse("概率论与数理统计", "3", "MS202018", "40", "王率", "3", "A509");
                System.out.println();
                System.out.println(update);
                System.out.println();

                mapper.deleteCourse("MS202018");
                System.out.println();
                System.out.println("MS202018");
                System.out.println();

                // mapper.deleteCourses(new String[]{"MS202018"});
                // System.out.println();
                // System.out.println("MS202018");
                // System.out.println();

                session.commit();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
