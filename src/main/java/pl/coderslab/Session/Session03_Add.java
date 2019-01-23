package pl.coderslab.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addToSession")
public class Session03_Add extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        int num = Integer.parseInt(value);

        HttpSession session = request.getSession();

        session.setAttribute(key,num);
        int str = (int) session.getAttribute(key);

        response.getWriter().append(Integer.toString(str));



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter().append("<form action=\"addToSession\" method=\"POST\">")
                .append("<label>").append("Klucz:").append("<input type=\"text\" name=\"key\">")
                .append("</label>").append("<label>").append("Wartosc")
                .append(" <input type=\"text\" name=\"value\">")
                .append("</label>").append("<input type=\"submit\">").append("</form>");
    }
}
