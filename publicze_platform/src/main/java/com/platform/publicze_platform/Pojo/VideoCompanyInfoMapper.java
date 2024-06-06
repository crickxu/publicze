package com.platform.publicze_platform.Pojo;

import com.platform.publicze_platform.Dao.VideoCompanyInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VideoCompanyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoCompanyInfo record);

    int insertSelective(VideoCompanyInfo record);

    VideoCompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoCompanyInfo record);

    int updateByPrimaryKey(VideoCompanyInfo record);
}