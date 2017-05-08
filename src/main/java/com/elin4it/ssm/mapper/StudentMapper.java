package com.elin4it.ssm.mapper;

import com.elin4it.ssm.pojo.Student;
import com.elin4it.ssm.sqlproviders.EmployerSqlProvider;
import org.apache.ibatis.annotations.*;

/**
 * Created by jn on 2017/5/3.
 */
public interface StudentMapper {

    /**
     * 查找STUDENTS表中的一行数据
     * @param studId
     * @return
     */
    @Select("SELECT STUD_ID AS STUDID, NAME, EMAIL, PHONE FROM STUDENTS WHERE STUD_ID=#{studId}")
    Student findStudentById(Integer studId);

    /**
     * 查找STUDENTS表中的一行数据,以及contactInfo的数据(写死在SELECT语句中)
     * @param studId
     * @return
     */
    @Select("SELECT '固化在SQL中的地址' AS ADDRESS, '固化在SQL中的邮编' AS ZIP, S.* FROM STUDENTS S WHERE S.STUD_ID=#{studId}")
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
                    @Result(column = "stud_id", property = "contactInfo",
                        one = @One(select = "com.elin4it.ssm.mapper.ContactInfoMapper.findContactInfoByStudId")//一对一映射
                    )
            }
    )
    Student findStudentById3(Integer studId);


}
