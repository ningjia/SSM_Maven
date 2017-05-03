package com.elin4it.ssm.pojo;

/**
 * Created by jn on 2017/5/3.
 */
public class Student {
    private Integer STUDID;

    private String NAME;

    private String EMAIL;

    private String PHONE;

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public Integer getSTUDID() {

        return STUDID;
    }

    public void setSTUDID(Integer STUDID) {
        this.STUDID = STUDID;
    }
}
