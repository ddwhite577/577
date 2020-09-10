package cn.studentwebsite.demoSQL;

import java.sql.*;

public class demoMysqlQueryUpdate {
    public static void main(String[] args) {

        try {
            //注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接对象 连接数据库
           Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false","root","123456");
            //获取执行sql语句的对象
            Statement statement=conn.createStatement();
            //sql语句
//            String sql="insert into student value('翠花',0,18)";
//            String sql="delete from student where age=20";

            String sql="select * from student";
            //执行sql
//            int count = statement.executeUpdate(sql);
            ResultSet resultSet = statement.executeQuery(sql);
            //2
//            System.out.println(count);

            //处理结果
            //将光标向下移动一行
            while (resultSet.next()) {
                //显示数据
                String name = resultSet.getString(1);
                int sex = resultSet.getInt("sex");
                int age = resultSet.getInt(3);

                System.out.println("姓名：" + name + " 性别：" + sex + " age：" + age);
            }



            //释放执行sql的对象
            statement.close();
            //释放连接数据库的对象
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
