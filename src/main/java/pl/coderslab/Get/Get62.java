package pl.coderslab.Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get62")
public class Get62 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String strYear = request.getParameter("year");

        for (int i=1; i<=5; i++){
            response.getWriter().append("<a href='/Get63?year="+ strYear+"&mix="+i+"'> Rok "+ strYear+", mix "+i+" </a>").append("<br>");
        }


    }
}
