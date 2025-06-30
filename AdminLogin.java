package admin;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AdminLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "admin123".equals(password)) {
            response.sendRedirect("admin-dashboard.jsp");
        } else {
            response.getWriter().println("Invalid Admin Login!");
        }
    }
}
