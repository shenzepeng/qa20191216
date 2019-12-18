package com.dao;

import com.pojo.QqMember;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
        String sql="INSERT INTO qq_member(qq_number,password,img_url,nick_name,sex)" +
                " VALUES('"+qqMember.getQqNumber()+"','"+qqMember.getPassword()+"','"+qqMember.getImgUrl()+"','"+qqMember.getNickName()+"','"+qqMember.getSex()+"')";
        Integer result = ConnOp.insert(sql);
     
        return result;
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    public Integer deleteQqMemberById(Integer id){
        String sql="DELETE FROM qq_member WHERE id="+id;
        Integer result = ConnOp.delete(sql);
        return result;
    }

    /**
     * y=x+z
     * x用户名
     * z密码
     * 输出y 用户详情
     * @param username
     * @param password
     * @return
     */
    public QqMember login(String username,String password) {
        String sql="SELECT * FROM qq_member WHERE qq_number='"+username+"' AND password='"+password+"'";
        ResultSet resultSet = ConnOp.find(sql);

        QqMember qqMember=new QqMember();
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String imgURl = resultSet.getString("img_url");
                String nickName = resultSet.getString("nick_name");
                String sex = resultSet.getString("sex");
                qqMember.setQqNumber(username);
                qqMember.setPassword(password);
                qqMember.setImgUrl(imgURl);
                qqMember.setSex(sex);
                qqMember.setNickName(nickName);
                qqMember.setId(id);
            }
        }catch (Exception e){
            System.err.println(e);
        }finally {

        }
        return qqMember;
    }
    //通过用户名去搜索用户
    public List<QqMember> findQqMemberNickNameLike(String username){
        String sql="SELECT * FROM qq_member WHERE name LIKE username";
        ResultSet resultSet = ConnOp.find(sql);
        List<QqMember> list=new ArrayList<QqMember>();
        try {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String imgURl = resultSet.getString("img_url");
                String qqNumber=resultSet.getString("qq_number");
                String password=resultSet.getString("password");
                String nickName = resultSet.getString("nick_name");
                String sex = resultSet.getString("sex");
                QqMember qqMember=new QqMember();
                qqMember.setQqNumber(qqNumber);
                qqMember.setPassword(password);
                qqMember.setImgUrl(imgURl);
                qqMember.setSex(sex);
                qqMember.setNickName(nickName);
                qqMember.setId(id);
                list.add(qqMember);
            }
        }catch (Exception e){
            System.err.println(e);
        }finally {

        }
        return list;
    }

    public Integer updateQqMemberInfoById(QqMember qqMember){
        String sql="UPDATE qq_member SET nick_name='"+qqMember.getNickName()+"'," +
                "img_url='"+qqMember.getImgUrl()+"',sex='"+qqMember.getSex()+"' WHERE id="+qqMember.getId();
        return ConnOp.update(sql);
    }
    public static void main(String[] args) {
        QqMemberDao qqMemberDao=new QqMemberDao();
//        List<QqMember> list = qqMemberDao.login("123", "123");
//        System.out.println(list);
        QqMember qqMember=new QqMember();
        qqMember.setNickName("年审费no");
        qqMember.setImgUrl("我按揭搜呢就 ");
        qqMember.setPassword("nskjdfngoisndfgn");
        qqMember.setId(2);
//        Integer result = qqMemberDao.addQqMebmer(qqMember);
     //   System.out.println(result);

        Integer result =qqMemberDao.updateQqMemberInfoById(qqMember);
        System.out.println(result);
    }
}
