package com.elin4it.ssm.sqlproviders;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

/**
 * Created by jn on 2017/5/7.
 */
public class EmployerSqlProvider {

    /**
     * SqlProvider方法,支持一个参数
     * @param employerId
     * @return
     */
    public String findEmployerById_Sql(final Integer employerId)
    {
        //return "SELECT employerId, name, sex, companyId FROM employer WHERE employerId="+employerId;
        //除了上面这种手写SQl的方式,还可以使用org.apache.ibatis.jdbc.SQL工具类来准备相同的SQL语句,代码如下
        return new SQL(){
            {
                SELECT("employerId, name, sex, companyId");
                FROM("employer");
                WHERE("employerId="+employerId);
            }
        }.toString();
    }

    /**
     * SqlProvider方法,支持多个参数(使用Map来传递参数值)
     * @param param
     * @return
     */
    public String findEmployersByCompanyAndSex_Sql(Map param)
    {
        //读取参数,生成where语句
        Integer param_company = (Integer) param.get("param1");//Mapper中的参数,会以param1,param2(或0，1)等来作为key值
        String param_sex = (String) param.get("param2");
        String str_where = "";
        if(param_company!=null){
            str_where += " and companyId=#{param1}";
        }
        if(param_sex!=null && !param_sex.trim().equals("")){
            str_where += " and sex=#{param2}";
        }
        final String finalStr_where = str_where;
        //拼装Sql语句
        return new SQL(){
            {
                SELECT("employerId, name, sex, companyId");
                FROM("employer");
                //WHERE("companyId=#{param1} and sex=#{param2}");
                WHERE("1=1"+finalStr_where);
            }
        }.toString();
    }

    /**
     * SqlProvider方法,支持多个参数(使用@Param注解来传递参数值)
     * @return
     */
    public String findEmployersByCompanyAndSex2_Sql()
    {
        return new SQL(){
            {
                SELECT("employerId, name, sex, companyId");
                FROM("employer");
                WHERE("companyId=#{param_companyId} and sex=#{param_sex}");
            }
        }.toString();
    }

}
