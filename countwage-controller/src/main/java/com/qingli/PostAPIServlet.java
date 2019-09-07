package com.qingli;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "PostAPIServlet")
public class PostAPIServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer jb= new StringBuffer();
        String line=null;
        BufferedReader reader =request.getReader();
        while ((line=reader.readLine())!=null){
            jb.append(line);
        }
        System.out.println(jb);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration postname=request.getParameterNames();
        while (postname.hasMoreElements()){
            System.out.println(postname.nextElement());
        }
        System.out.println();
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        System.out.println(name);
        System.out.println(password);
        request.getReader().readLine();
    }
}
