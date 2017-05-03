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

    @Select("SELECT 'testAddress' AS ADDRESS, 'testZip' AS ZIP, S.* FROM STUDENTS S WHERE S.STUD_ID=#{studId}")
    @Results(
            {
                @Result(id = true, column = "stud_id", property = "studId"),
                @Result(column = "name", property = "name"),
                @Result(column = "email", property = "email"),
                @Result(column = "phone", property = "phone"),
                @Result(column = "address", property = "contactInfo.address"),
                @Result(column = "zip", property = "contactInfo.zip")
            }
    )
    Student findStudentById2(Integer studId);

}
