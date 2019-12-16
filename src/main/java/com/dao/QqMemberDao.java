package com.dao;

import com.pojo.QqMember;

import java.util.UUID;

/**
 * @Auther: szp
 * @Date: 2019/12/16 22:29
 * @Description:
 */
public class QqMemberDao {
    /**
     * 传入一个qq号
     * 添加进入数据
     * 将添加的结果返回出来
     * @param
     * @return
     */
    public Integer addQqMebmer(QqMember qqMember){
        String sql="INSERT INTO t_qq_merber(qq_number,password,img_url,nick_name,sex)" +
                " VALUES('"+qqMember.getQqNumber()+"','"+qqMember.getPassword()+"','"+qqMember.getImgUrl()+"','"+qqMember.getNickName()+"','"+qqMember.getSex()+"')";
        Integer result = ConnOp.insert(sql);
        return result;
    }

    public static void main(String[] args) {
        //当前的类
        QqMemberDao qqMemberDao=new QqMemberDao();
        //新的qq成员
        for(int i=0;i<10;i++) {
            QqMember qqMember = new QqMember();
            qqMember.setImgUrl(UUID.randomUUID().toString());
            qqMember.setQqNumber(UUID.randomUUID().toString());
            qqMember.setPassword(UUID.randomUUID().toString());
            qqMember.setNickName(UUID.randomUUID().toString());
            qqMember.setSex("男");
            Integer result = qqMemberDao.addQqMebmer(qqMember);
            System.out.println(result);
        }

    }
}
