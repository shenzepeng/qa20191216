package com.service.impl;

import com.dao.QqMemberDao;
import com.pojo.QqMember;
import com.service.QqMemberService;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/18 21:10
 * @Description: 沈泽鹏写点注释吧
 */
public class QqMemberServiceImpl implements QqMemberService {
    QqMemberDao qqMemberDao;

    public QqMemberServiceImpl(){
        qqMemberDao=new QqMemberDao();
    }
    public QqMember login(String qqNumber, String password) {
        QqMember qqMember = qqMemberDao.login(qqNumber, password);
        return qqMember;
    }

    public static void main(String[] args) {
        QqMemberService qqMemberService = new QqMemberServiceImpl();
        QqMember login = qqMemberService.login("123", "123");
        System.out.println(login);
    }
}
