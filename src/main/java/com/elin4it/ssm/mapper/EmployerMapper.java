package com.elin4it.ssm.mapper;

import com.elin4it.ssm.pojo.Employer;
import com.elin4it.ssm.pojo.Student;
import com.elin4it.ssm.sqlproviders.EmployerSqlProvider;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.javassist.bytecode.annotation.IntegerMemberValue;

import java.util.List;

/**
 * Created by jn on 2017/5/3.
 */
public interface EmployerMapper {

    @SelectProvider(type = EmployerSqlProvider.class, method = "findEmployerById_Sql")
    Employer findEmployerById(Integer employerId);

    @SelectProvider(type=EmployerSqlProvider.class,method="findEmployersByCompanyAndSex_Sql")
    List<Employer> findEmployersByConpanyAndSex(Integer companyId, String sex);

}
