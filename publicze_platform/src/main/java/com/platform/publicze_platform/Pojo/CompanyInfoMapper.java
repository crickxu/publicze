package com.platform.publicze_platform.Pojo;

import com.platform.publicze_platform.Dao.CompanyInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);
}