package com.example.assignment_webarch;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogServlet", value = "/LogServlet")
public class LogServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("link.html").include(request,response);

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if(username.equals("charifabdallah") && password.equals("1234")){
            out.println("<h1>"+"Welcome "+username+"</h1>");
            out.println("<br>\n" + "<form method=\"POST\" action=\"logout\"> <input"
            + "type=\"submit\" value=\"Log out\"></form>");
        }
    }
}
