package com.elin4it.ssm.mapper;

import com.elin4it.ssm.pojo.Student;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jn on 2017/5/3.
 */
public interface StudentMapper {

    @Select("SELECT STUD_ID AS STUDID, NAME, EMAIL, PHONE FROM STUDENTS WHERE STUD_ID=#{studId}")
    Student findStudentById(Integer studId);

}
