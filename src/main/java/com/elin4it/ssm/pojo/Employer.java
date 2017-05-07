package com.elin4it.ssm.pojo;

import java.util.List;

/**
 * Created by jn on 2017/5/3.
 */
public class Employer {

    private Integer employerId;

    private String name;

    private String sex;

    private Integer companyId;

    public Integer getEmployerId() {
        return employerId;
    }

    public void setEmployerId(Integer employerId) {
        this.employerId = employerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }


}
