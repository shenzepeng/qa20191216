package com.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:48
 * @Description: 空间评论
 */
@Data
public class QZoneComments {
    /**
     * 评论的id
     */
    private Integer id;
    /**
     * 评论的内容
     */
    private String content;
    /**
     * 评论人的id
     */
    private Integer writeId;
    /**
     * 收到人的id
     */
    private Integer receiveId;
    /**
     * 发表评论的时间
     */
    private Date createTime;
}
