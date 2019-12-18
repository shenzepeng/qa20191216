package com.service.impl;

import com.pojo.QZoneLogCommontShip;
import com.service.QZoneShipLogCommitShipService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/18 22:03
 * @Description: 沈泽鹏写点注释吧
 */
public class QZoneShipLogCommitShipServiceImpl implements QZoneShipLogCommitShipService {
    public Integer addCommitShip(QZoneLogCommontShip qZoneLogCommontShip) {
        return null;
    }

    //1.现在日志和评论关系中找到，所有档期日志的评论id

    //2.有很多个日志评论的id
    List<Integer> ids=new ArrayList<Integer>();

    //3.在哪这些id，去评论表中找到所有的评论
}
