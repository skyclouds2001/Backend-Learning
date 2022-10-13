package org.sky.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MaBatisDemo {

    public void run() {
        try {
            String resource = "config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            try (SqlSession session = sqlSessionFactory.openSession()) {
                /*
                List<Course> courses = session.selectList("org.sky.mybatis.Mapper.selectCourse");
                System.out.println();
                System.out.println(courses);
                System.out.println();
                 */

                Mapper mapper = session.getMapper(Mapper.class);

                List<Course> courses = mapper.selectCourse();
                System.out.println();
                System.out.println(courses);
                System.out.println();

                List<Course> course = mapper.selectCourseWithName("数据结构");
                System.out.println();
                System.out.println(course);
                System.out.println();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}