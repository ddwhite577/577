package cn.studentwebsite.dao;

import cn.studentwebsite.domain.User;
import cn.studentwebsite.util.JDBCUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * 操作数据库中User表的类
 * */
public class UserDao {

   //声明JDBCTemplate对象 共用
    private JdbcTemplate template=new JdbcTemplate(JDBCUtil.getDataSource());


    /**
     * @param loginUser
     * @return User包含用户所有数据
     * @author 一只搬砖的码蚁
     * @date 2020/9/8 15:47
     */
    public User login(User loginUser){
        //编写sql
        String sql="select* from user where username=? and password=?";
        //调用template的查询方法query
        User user=template.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), loginUser.getUsername(), loginUser.getPassword());
        return user;
    }
}
