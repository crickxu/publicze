package com.platform.publicze_platform.Dao;

import java.util.Date;
import lombok.Data;

@Data
public class ImgCompanyInfo {
    private Integer id;

    /**
    * 公司编号
    */
    private String companyNo;

    /**
    * 图片路径
    */
    private String imgPath;

    /**
    * 图片说明
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