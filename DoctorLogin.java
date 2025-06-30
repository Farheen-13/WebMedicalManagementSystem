package doctor;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DoctorLogin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("doctor".equals(username) && "doc123".equals(password)) {
            response.sendRedirect("doctor-dashboard.jsp");
        } else {
            response.getWriter().println("Invalid Doctor Login!");
        }
    }
}
