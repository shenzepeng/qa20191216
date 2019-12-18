package com.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:41
 * @Description: qq空间
 */
@Data
public class QZone {
    /**
     * 主键id
     */
    private Integer id;
    /**
     * qq空间名称
     */
    private String zoneName;
    /**
     * qq空间背景图
     */
    private String backGroundPicture;
    /**
     * qq秀
     */
    private String qqShowPhoto;

}
