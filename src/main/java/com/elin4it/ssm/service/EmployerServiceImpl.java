package com.elin4it.ssm.service;

import com.elin4it.ssm.mapper.EmployerMapper;
import com.elin4it.ssm.pojo.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jn on 2017/5/7.
 */
@Service
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    private EmployerMapper employerMapper;

    /**
     * 查询一行数据
     * @param employerId
     * @return
     * @throws Exception
     */
    public Employer findEmployer(Integer employerId) throws Exception {
        Employer employer = employerMapper.findEmployerById(employerId);
        return employer;
    }

    /**
     * 查询多行数据
     * @param companyId
     * @param sex
     * @return
     * @throws Exception
     */
    public List<Employer> findEmployers(Integer companyId, String sex) throws Exception {
        List<Employer> list = employerMapper.findEmployersByCompanyAndSex(companyId,sex);
        return list;
    }

    /**
     * 查询多行数据
     * @param companyId
     * @param sex
     * @return
     * @throws Exception
     */
    public List<Employer> findEmployers2(Integer companyId, String sex) throws Exception {
        List<Employer> list = employerMapper.findEmployersByCompanyAndSex2(companyId,sex);
        return list;
    }
}
