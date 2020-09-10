package cn.studentwebsite.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * JDBC工具类 使用Druid连接池
 * */
public class JDBCUtil {
    private static DataSource ds;

    static {
        //静态代码化初始化数据

        //加载配置文件的对象
        Properties pro=new Properties();
        //使用ClassLoader加载配置文件，获取字节输入流
        InputStream is=JDBCUtil.class.getClassLoader().getResourceAsStream("druid.properties");
        //加载
        try {
            //读取配置文件
            pro.load(is);
            //加载配置文件信息 初始化连接池
            ds = DruidDataSourceFactory.createDataSource(pro);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
    * 获取连接池对象
    * */
    public static DataSource getDataSource(){
        return ds;
    }
    /*
    * 获取连接Connection对象
    * */
    public static Connection getConnection() throws SQLException {
        return ds.getConnection();
    }
}
