package com.elin4it.ssm.service;

import com.elin4it.ssm.mapper.StudentMapper;
import com.elin4it.ssm.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jn on 2017/5/3.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student findStudent() throws Exception {
        Student student = studentMapper.findStudentById(1);
        return student;
    }

    public Student findStudent2() throws Exception {
        Student student = studentMapper.findStudentById2(2);
        return student;
    }
}
