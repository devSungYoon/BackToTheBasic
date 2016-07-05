package com.artiveloper.study.sunwoo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kimsunwoo on 2016. 7. 3..
 */
@WebServlet("/test")
public class TestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String currentTip = "Tags makte things bold!";
        req.setAttribute("pageContent", currentTip);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("WEB-INF/views/sunwootest/testPage.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
}
