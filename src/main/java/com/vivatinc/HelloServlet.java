package com.vivatinc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.RequestDispatcher;

public class HelloServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        final String username = req.getParameter("username");
        req.setAttribute("username",username);
        RequestDispatcher requestDispatcher = null;
            requestDispatcher = req.getRequestDispatcher("response.jsp");
            requestDispatcher.forward(req,resp );

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
