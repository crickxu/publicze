package com.platform.publicze_platform.Service;

import com.platform.publicze_platform.Dao.ImgCompanyInfo;
public interface ImgCompanyInfoService{


    int deleteByPrimaryKey(Integer id);

    int insert(ImgCompanyInfo record);

    int insertSelective(ImgCompanyInfo record);

    ImgCompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImgCompanyInfo record);

    int updateByPrimaryKey(ImgCompanyInfo record);

}
