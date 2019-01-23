package pl.coderslab.Simple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Servlet14")
public class Servlet14 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("witaj zadanie 4");
        System.out.println("test");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init");
    }
}
