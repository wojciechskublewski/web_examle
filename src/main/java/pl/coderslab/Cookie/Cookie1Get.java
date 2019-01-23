package pl.coderslab.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getCookie")
public class Cookie1Get extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();
        String cookieValue = null;

        for (Cookie c : cookies) {
            response.getWriter().append(c.getName()).append(" - ").append(c.getValue()).append("<br>");

        }
    }
}
