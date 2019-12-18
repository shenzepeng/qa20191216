package com.service;

import com.pojo.QqMember;

/**
 * @Auther: szp
 * @Date: 2019/12/18 21:09
 * @Description: 沈泽鹏写点注释吧
 */
public interface QqMemberService {
    /**
     * 用户登录
     * @param qqNumber
     * @param password
     * @return
     */
    QqMember login(String qqNumber,String password);
}
