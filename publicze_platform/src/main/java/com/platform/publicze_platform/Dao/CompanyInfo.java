package com.platform.publicze_platform.Dao;

import java.util.Date;
import lombok.Data;

@Data
public class CompanyInfo {
    private Integer id;

    /**
     * 公司编号
     */
    private String companyNo;

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 统一信用代码
     */
    private String creditCode;

    /**
     * 0:国企1：央企2：民营企业
     */
    private Integer natureId;

    /**
     * 公司规模
     */
    private Integer scale;

    /**
     * 所在省
     */
    private String provinceAddr;

    /**
     * 所在市
     */
    private String cityAddr;

    /**
     * 具体地址
     */
    private String contact;

    /**
     * 公司介绍
     */
    private String introduction;

    /**
     * 联系号码
     */
    private String mobileNum;

    /**
     * 图片路径
     */
    private String imgPath;

    /**
     * 发布类型(0-企业资源 1-企业融资 2-企业合作 3-企业代理，可多种组合)
     */
    private Integer eventType;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 所属具体行业
     */
    private String subIndustry;

    /**
     * 创建时间
     */
    private Date createTime;
}