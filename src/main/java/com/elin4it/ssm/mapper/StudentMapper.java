package com.elin4it.ssm.mapper;

import com.elin4it.ssm.pojo.Student;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jn on 2017/5/3.
 */
public interface StudentMapper {

    @Select("SELECT STUD_ID AS STUDID, NAME, EMAIL, PHONE FROM STUDENTS WHERE STUD_ID=#{studId}")
    Student findStudentById(Integer studId);

    @Select("SELECT 'testAddress' AS ADDRESS, S.* FROM STUDENTS S WHERE S.STUD_ID=#{studId}")
    @Results(
            {
                @Result(id = true, column = "stud_id", property = "STUDID"),
                @Result(column = "name", property = "NAME"),
                @Result(column = "email", property = "EMAIL"),
                @Result(column = "phone", property = "PHONE"),
                @Result(column = "ADDRESS", property = "contactInfo.ADDRESS")
            }
    )
    Student findStudentById2(Integer studId);

}
