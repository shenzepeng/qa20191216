package com.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:44
 * @Description: 空间日志
 */
@Data
public class QZoneLog {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 日志的标题
     */
    private String title;
    /**
     * 日志的内容
     */
    private String content;
    /**
     * 日志的创建时间
     */
    private Date createDate;
}
