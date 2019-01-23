package pl.coderslab.Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get61")
public class Get61 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        for(int i=1980; i<=2010; i++){
            response.getWriter().append("<a href='/Get62?year=" + i+ "'> Link do roku "+i+" </a>").append("<br>");
        }
    }
}
