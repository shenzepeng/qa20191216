package com.service;/**
 * @Auther: szp
 * @Date: 2019/12/18 21:28
 * @Description: qq关系的业务逻辑
 */

import com.pojo.QqGroup;
import com.pojo.QqMemberShip;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.List;

public interface QqMemberShipService {
    Integer addQqFriend(QqMemberShip qqMemberShip);

    List<QqMemberShip> find(Integer qqMemberId);

    Integer updateFriendShip(QqMemberShip qqMemberShip);

    Integer deleteFriendShip(Integer id);
}
