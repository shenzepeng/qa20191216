package com.service;

import com.pojo.QZone;
import com.pojo.QZoneMemerShip;

/**
 * @Auther: szp
 * @Date: 2019/12/18 21:48
 * @Description: 沈泽鹏写点注释吧
 */
public interface QZoneMemerShipService {
    Integer addQzone(QZoneMemerShip qZone);

    QZoneMemerShip findQzoneByQqId(Integer id);


}
