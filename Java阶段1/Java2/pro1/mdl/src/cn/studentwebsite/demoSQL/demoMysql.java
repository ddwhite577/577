package cn.studentwebsite.demoSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demoMysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //获取数据库的连接对象
       Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123456");
        //定义SQL语句
        String sql="Update student set sex=1,age=18 where age=18";
        //获取执行SQL的对象
        Statement statement = conn.createStatement();
        //执行SQL
        int count=statement.executeUpdate(sql);
        //处理结果
        System.out.println("count："+count);
        //释放资源
        statement.close();
        statement.close();
    }
}
