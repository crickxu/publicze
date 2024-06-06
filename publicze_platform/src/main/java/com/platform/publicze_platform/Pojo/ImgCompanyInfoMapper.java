package com.platform.publicze_platform.Pojo;

import com.platform.publicze_platform.Dao.ImgCompanyInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ImgCompanyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ImgCompanyInfo record);

    int insertSelective(ImgCompanyInfo record);

    ImgCompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ImgCompanyInfo record);

    int updateByPrimaryKey(ImgCompanyInfo record);
}