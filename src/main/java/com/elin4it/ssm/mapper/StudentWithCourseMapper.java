package com.elin4it.ssm.mapper;

import com.elin4it.ssm.pojo.Course;
import com.elin4it.ssm.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by jn on 2017/5/5.
 */
public interface StudentWithCourseMapper {

    /**
     * 查找STUDENTS表中的一行数据,并通过一对一映射,找出关联的contactInfo表数据
     * @param studId
     * @return
     */
    @Select("SELECT * FROM STUDENTS WHERE STUD_ID=#{studId}")
    @Results(
            {
                    @Result(id = true, column = "stud_id", property = "studId"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "email", property = "email"),
                    @Result(column = "phone", property = "phone"),
                    /* 一对一映射,查找关联的contactInfo表数据。调用的是另一个Mapper中的方法(目的是验证是否可以调用不同Mapper中的方法) */
                    @Result(column = "stud_id", property = "contactInfo",
                            one = @One(select = "com.elin4it.ssm.mapper.ContactInfoMapper.findContactInfoByStudId")
                    ),
                     /* 一对多映射,查找关联的course表数据。调用的是同一个Mapper中的方法 */
                    @Result(column = "stud_id", property = "courses",
                            many = @Many(select = "com.elin4it.ssm.mapper.StudentWithCourseMapper.findCoursesByStudId")
                    )
            }
    )
    Student findStudentById(Integer studId);


    /**
     * 根据studId,找出对应的course表的数据(多行)
     * @param studId
     * @return
     */
    @Select("SELECT * FROM Course WHERE studId=#{studId}")
    @Results(
            {
                    @Result(id = true, column = "courseId", property = "courseId"),
                    @Result(column = "studId", property = "studId"),
                    @Result(column = "name", property = "name"),
                    @Result(column = "desc", property = "desc")
            }
    )
    List<Course> findCoursesByStudId(Integer studId);
}
