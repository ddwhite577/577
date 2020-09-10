package cn.studentwebsite.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Request123")
public class demoRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /**
         * 方法
         * - 获取请求方法：String getMethod().  如GET
         * - （*）获取虚拟目录：String getContextPath().  如/day
         * - 获取Servlet1路径：String getServletPath(). 如/demo
         * - 获取get方式请求参数：String getQueryString(). 如name=zhangsan
         * - （*）获取URI：String getRequestURI(). 如/day/demo
         * - 获取URL：StringBuffer getRequestURL(). 如http://localhost/day/demo?name=zhangsan
         * - 获取协议和版本：String getProtocol():  如HTTP/1.1
         * - 获取客户机IP地址：String getRemoteAddr(). 如192.168.43.102
         * */
       // System.out.println("doGet");
        String method=req.getMethod();
        System.out.println("请求方法："+method);
        String contextPath=req.getContextPath();
        System.out.println("虚拟目录："+contextPath);
        String servletPath=req.getServletPath();
        System.out.println("servlet路径："+servletPath);
        String queryString=req.getQueryString();
        System.out.println("请求参数："+queryString);
        String requestURI=req.getRequestURI();
        System.out.println("URI："+requestURI);
        StringBuffer requestURL=req.getRequestURL();
        System.out.println("URL："+requestURL);
        String protocol=req.getProtocol();
        System.out.println("协议和版本信息："+protocol);
        String remoteAddr=req.getRemoteAddr();
        System.out.println("IP地址："+remoteAddr);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("123");
    }
}
