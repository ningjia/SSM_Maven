package com.elin4it.ssm.service;

import com.elin4it.ssm.pojo.Employer;

import java.util.List;

/**
 * Created by jn on 2017/5/7.
 */
public interface EmployerService {
    Employer findEmployer(Integer employerId) throws Exception;
    List<Employer> findEmployers(Integer companyId, String sex) throws Exception;
}
