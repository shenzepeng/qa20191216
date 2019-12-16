package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/16 22:24
 * @Description: 沈泽鹏写点注释吧
 */
public class ConnOp {
    //用哪类去操作mysql
    private static final String DRIVER="com.mysql.jdbc.Driver";
    //连接的数据库，结构是 协议+ip地址+端口号+数据库名
    private static final String URL="jdbc:mysql://101.132.33.149:3306/shenzepeng";
    //数据库的用户名
    private static final String USERNAME="root";
    //密码
    private static final String PASSWORD="123456";

    /**
     * 添加
     * y=kx+z
     */
    public static Integer insert(String sql){
        Connection connection=null;
        Statement statement=null;
        try {
            //加载驱动   将连接的类实例化
            Class.forName(DRIVER);
            //获取连接的对象
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //获取执行的对象
            statement=connection.createStatement();
            Integer executeUpdate = statement.executeUpdate(sql);
            return executeUpdate;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                statement.close();
                connection.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }
        return null;

    }

    public static Integer update(String sql){
        Connection connection=null;
        Statement statement=null;
        try {
            //加载驱动   将连接的类实例化
            Class.forName(DRIVER);
            //获取连接的对象
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //获取执行的对象
            statement=connection.createStatement();
            Integer executeUpdate = statement.executeUpdate(sql);
           return executeUpdate;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                statement.close();
                connection.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }
        return null;
    }

    public static Integer delete(String sql){
        Connection connection=null;
        Statement statement=null;

        try {
            //加载驱动   将连接的类实例化
            Class.forName(DRIVER);
            //获取连接的对象
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //获取执行的对象
            statement=connection.createStatement();
            Integer executeUpdate = statement.executeUpdate(sql);
           return executeUpdate;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                statement.close();
                connection.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }
        return null;
    }

    public static ResultSet find(String sql){
        Connection connection=null;
        Statement statement=null;

        try {
            //加载驱动   将连接的类实例化
            Class.forName(DRIVER);
            //获取连接的对象
            connection= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            //获取执行的对象
            statement=connection.createStatement();
            //查询操作
            ResultSet resultSet = statement.executeQuery(sql);
            return resultSet;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                statement.close();
                connection.close();
            }catch (Exception e){
                System.out.println(e);
            }

        }
        return null;

    }

}
