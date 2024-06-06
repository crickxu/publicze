package com.platform.publicze_platform.Dao;

import java.util.Date;
import lombok.Data;

@Data
public class VideoCompanyInfo {
    private Integer id;

    /**
     * 公司编号
     */
    private String companyNo;

    /**
     * 视频路径
     */
    private String videoPath;

    /**
     * 视频说明
     */
    private String discription;

    /**
     * 是否可用
     */
    private Boolean enable;

    /**
     * 创建时间
     */
    private Date createTime;
}