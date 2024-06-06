package com.platform.publicze_platform.Dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-platform-publicze_platform-Dao-Region")
@Data
public class Region {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 地区编号
    */
    @ApiModelProperty(value="地区编号")
    private String regionNo;

    /**
    * 父地区编号
    */
    @ApiModelProperty(value="父地区编号")
    private String parenRegionNo;

    /**
    * 是否热门城市
    */
    @ApiModelProperty(value="是否热门城市")
    private Boolean isPopular;

    /**
    * 地区名称
    */
    @ApiModelProperty(value="地区名称")
    private String name;

    /**
    * 备注
    */
    @ApiModelProperty(value="备注")
    private String remark;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;
}