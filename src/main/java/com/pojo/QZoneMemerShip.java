package com.pojo;

import lombok.Data;

/**
 * @Auther: szp
 * @Date: 2019/12/16 21:55
 * @Description: qq空间和用户的关系
 */
@Data
public class QZoneMemerShip {
    private Integer id;
    /**
     * qq号的id
     */
    private Integer memberId;
    /**
     * 空间的id
     */
    private Integer zoneId;
}
