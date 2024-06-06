package com.platform.publicze_platform.Service;

import com.platform.publicze_platform.Dao.CompanyInfo;

public interface CompanyInfoService {


    int deleteByPrimaryKey(Integer id);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);

}

