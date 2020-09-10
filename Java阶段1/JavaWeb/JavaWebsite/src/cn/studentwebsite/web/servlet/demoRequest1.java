package cn.studentwebsite.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/demoRequest1")
public class demoRequest1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取名称
//        Enumeration<String> parameterNames = request.getParameterNames();
//       while (parameterNames.hasMoreElements()){
//           String name=parameterNames.nextElement();
//           String value = request.getParameter(name);
//           System.out.println("POST:"+name+"="+value);
//       }

       //Map
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String s : parameterMap.keySet()) {
            String[] strings=parameterMap.get(s);
            for (String v:strings){
            System.out.println("POST:"+v);
            }
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取名称
        Enumeration<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String name=parameterNames.nextElement();
            String value = request.getParameter(name);
            System.out.println("GET:"+name+"="+value);
        }
    }
}
