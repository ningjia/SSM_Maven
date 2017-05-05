package com.elin4it.ssm.mapper;

import com.elin4it.ssm.pojo.ContactInfo;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jn on 2017/5/5.
 */
public interface ContactInfoMapper {

     /**
     * 根据studId的值,找出contactInfo表的数据
     * @param studId
     * @return
     */
    @Select("SELECT conId, studId, address, zip FROM contactInfo WHERE studId=#{studId}")
    ContactInfo findContactInfoByStudId(Integer studId);

}
