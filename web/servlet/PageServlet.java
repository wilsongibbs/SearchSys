package com.wilsongibbs.searchsys.web.servlet;

import com.wilsongibbs.searchsys.domain.PageBean;
import com.wilsongibbs.searchsys.domain.User;
import com.wilsongibbs.searchsys.service.UserService;
import com.wilsongibbs.searchsys.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pageServlet")
public class PageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPage = request.getParameter("currentPage");
        String rows = request.getParameter("rows");
        if(currentPage==null || "".equals(currentPage)){
            currentPage="1";
        }
        if(rows==null || "".equals(rows)){
            rows="5";
        }
        int current = Integer.parseInt(currentPage);
        int row = Integer.parseInt(rows);
        if(current < 1){
            current = 1;
        }
        UserService userService = new UserServiceImpl();
        request.setAttribute("pageBean",userService.getPage(current,row));
        request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
