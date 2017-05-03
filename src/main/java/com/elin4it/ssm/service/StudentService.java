package com.elin4it.ssm.service;

import com.elin4it.ssm.pojo.Student;

import java.util.List;

/**
 * Created by jn on 2017/5/3.
 */
public interface StudentService {
    Student findStudent(Integer studId) throws Exception;
    Student findStudent2(Integer studId) throws Exception;
}
