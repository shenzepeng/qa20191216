package com.pojo;

import lombok.Data;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:33
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class QqMemberShip {
    /**
     * 记录id  主键id
     */
    private Integer id;
    /**
     * 自己qq号的id
     */
    private Integer qqMemberId;
    /**
     * 朋友qq号的id
     */
    private Integer friendId;
    /**
     * 分组id
     */
    private Integer groupId;
    /**
     * 0 特别关注
     * 1 拉黑了
     * 2 删除
     */
    private Short status;

}
