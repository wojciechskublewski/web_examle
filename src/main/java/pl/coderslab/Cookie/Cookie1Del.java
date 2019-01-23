package pl.coderslab.Cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteCookie")
public class Cookie1Del extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Cookie[] cookies = request.getCookies();
        String cookieName = "User";
        int a = cookies.length;
        int j = 1;
        boolean booVar =false;
        for (int i =0; i<cookies.length; i++) {
            j++;
            if (cookies[i].getName().equals(cookieName)){
                cookies[i].setMaxAge(0);
                response.addCookie(cookies[i]);
                response.getWriter().append("ciasteczko user usuniete");
                booVar=true;
            }

        }

        if(booVar==false) {
            response.getWriter().append("nie bylo ciasteczka User");
        }

    }
}
