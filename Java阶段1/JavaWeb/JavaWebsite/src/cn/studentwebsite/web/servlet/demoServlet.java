package cn.studentwebsite.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/HttpServlet/demo1")
public class demoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Enumeration<String> headerNames = req.getHeaderNames();//获取所有请求头名称
//        //遍历
//        while(headerNames.hasMoreElements()){
//            //获取
//            String name = headerNames.nextElement();
//            //获取值
//            String header = req.getHeader(name);
//            //显示
//            System.out.println(name+":"+header);
//        }
        String referer = req.getHeader("referer");
        if(referer.contains("/JavaWebsite_war_exploded")){
            //只要是这个虚拟目录来的请求，都接受
            System.out.println("欢迎:"+req.getHeader("referer"));
        }else{
            System.out.println("对不起，不欢迎，外站："+req.getHeader("referer"));
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
