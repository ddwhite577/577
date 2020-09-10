package cn.studentwebsite.test;

import cn.studentwebsite.dao.UserDao;
import cn.studentwebsite.domain.User;
import org.junit.Test;

public class UserDaoTest {
//    @Test
//    public void TestLogin(){
//        User loginUser=new User();
//        loginUser.setUsername("ant");
//        loginUser.setPassword("123456");
//        UserDao dao=new UserDao();
//        User login = dao.login(loginUser);
//        System.out.println(login);
//    }

    public static void main(String[] args) {
        User loginUser=new User();
        loginUser.setUsername("ant");
        loginUser.setPassword("123456");
        UserDao dao=new UserDao();
        User login = dao.login(loginUser);
        System.out.println(login);
    }
}
