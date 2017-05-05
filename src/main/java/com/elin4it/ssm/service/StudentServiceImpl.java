package com.elin4it.ssm.service;

import com.elin4it.ssm.mapper.StudentMapper;
import com.elin4it.ssm.mapper.StudentWithCourseMapper;
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
    @Autowired
    private StudentWithCourseMapper studentWithCourseMapper;

    public Student findStudent(Integer studId) throws Exception {
        Student student = studentMapper.findStudentById(studId);
        return student;
    }

    public Student findStudent2(Integer studId) throws Exception {
        Student student = studentMapper.findStudentById2(studId);
        return student;
    }

    public Student findStudent3(Integer studId) throws Exception {
        Student student = studentMapper.findStudentById3(studId);
        return student;
    }

    public Student findStudent4(Integer studId) throws Exception {
        Student student = studentWithCourseMapper.findStudentById(studId);
        return student;
    }
}
