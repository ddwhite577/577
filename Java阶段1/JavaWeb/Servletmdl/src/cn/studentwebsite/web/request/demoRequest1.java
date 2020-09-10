package cn.studentwebsite.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/Request1")
public class demoRequest1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //演示获取请求头的值
        String v=req.getHeader("referer");
        System.out.println("referer:"+v);

        //获取所有请求头名称
        Enumeration<String> headerNames=req.getHeaderNames();
        System.out.println(headerNames);
        //遍历
        while(headerNames.hasMoreElements()){
            String name=headerNames.nextElement();
           // System.out.println(name);
            //根据请求头获取请求头的值
            String value=req.getHeader(name);
           System.out.println(name+"："+value);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("123");
    }
}
