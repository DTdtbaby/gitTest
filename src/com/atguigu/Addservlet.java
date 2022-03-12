package com.atguigu;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//这个类需要继承.在lib也就是tomcat里面，因此需要导入tomcat的包
//把tomcat依赖加进来
public class Addservlet extends HttpServlet {
//1.实现用户发给我的数据。也就是接受form 表单里的post请求，此时使用dopost请求

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.1  request (服务器会把请求封装成request，因此可以获取信息）Parameter参数
        // 1.2respose
        String fname=req.getParameter("fname");
        String priceStr=req.getParameter("price");
        Integer price=Integer.parseInt(priceStr);
        String fcountStr=req.getParameter("fcount");
        Integer fcount=Integer.getInteger(fcountStr);
        String remark=req.getParameter("remark");

        System.out.println("fname="+fname);
        System.out.println("price="+price);
        System.out.println("fcount="+fcount);
        System.out.println("remark="+remark);
    }
}
