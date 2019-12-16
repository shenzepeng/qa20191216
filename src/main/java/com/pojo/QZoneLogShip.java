package com.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:45
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class QZoneLogShip {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 空间id
     */
    private Integer qZoneId;
    /**
     * 日志id
     */
    private Integer logId;
    /**
     * 发表日志时间
     */
    private Date creatTime;
}
