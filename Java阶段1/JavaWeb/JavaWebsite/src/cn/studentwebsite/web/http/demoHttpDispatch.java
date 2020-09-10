package cn.studentwebsite.web.http;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/demoRequest8888")
public class demoHttpDispatch extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST:demoRequest8888被请求");
        //转发  存储数据
        request.setAttribute("msg","hello");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/JavaWebsite_war_exploded/register.html");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET:demoRequest8888被请求");
        //转发  存储数据
        request.setAttribute("msg","hello");
       RequestDispatcher requestDispatcher = request.getRequestDispatcher("/demoDispatcher");
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/JavaWebsite_war_exploded/register.html");
        requestDispatcher.forward(request,response);
}
}
