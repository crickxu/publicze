package com.platform.publicze_platform.Service;

import com.platform.publicze_platform.Dao.VideoCompanyInfo;

public interface VideoCompanyInfoService {


    int deleteByPrimaryKey(Integer id);

    int insert(VideoCompanyInfo record);

    int insertSelective(VideoCompanyInfo record);

    VideoCompanyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoCompanyInfo record);

    int updateByPrimaryKey(VideoCompanyInfo record);

}

