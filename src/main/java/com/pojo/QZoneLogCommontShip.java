package com.pojo;

import lombok.Data;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:50
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class QZoneLogCommontShip {
    private Integer id;
    /**
     * 日志id
     */
    private Integer logId;
    /**
     * 评论id
     */
    private Integer commontId;
    /**
     * 创建时间
     */
    private Integer createTime;
}
