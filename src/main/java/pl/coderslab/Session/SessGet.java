package pl.coderslab.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

@WebServlet("/SessGet")
public class SessGet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html; charset=utf-8");

        Enumeration<String> keys = session.getAttributeNames();


        while (keys.hasMoreElements()){
            String key = keys.nextElement();
            int value = (int) session.getAttribute(key);
            response.getWriter().append("klucz: ")
                    .append(key)
                    .append("wartość: ")
                    .append(Integer.toString(value));
        }




    }
}
