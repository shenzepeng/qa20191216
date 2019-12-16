package com.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:39
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class QqGroup {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 分组名称
     */
    private String groupName;
    /**
     * 创建分组的时间
     */
    private Date createTime;
}
