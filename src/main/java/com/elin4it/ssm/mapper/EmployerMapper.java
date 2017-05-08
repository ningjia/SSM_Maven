package com.elin4it.ssm.mapper;

import com.elin4it.ssm.pojo.Employer;
import com.elin4it.ssm.sqlproviders.EmployerSqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by jn on 2017/5/3.
 */
public interface EmployerMapper {

    @SelectProvider(type = EmployerSqlProvider.class, method = "findEmployerById_Sql")
    Employer findEmployerById(Integer employerId);

    @SelectProvider(type=EmployerSqlProvider.class,method="findEmployersByCompanyAndSex_Sql")
    List<Employer> findEmployersByCompanyAndSex(Integer companyId, String sex);

    @SelectProvider(type = EmployerSqlProvider.class, method = "findEmployersByCompanyAndSex2_Sql")
    List<Employer> findEmployersByCompanyAndSex2(@Param(value="param_companyId") Integer companyId, @Param(value="param_sex") String sex);

}
