package pl.coderslab.Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get63")
public class Get63 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strYear = request.getParameter("year");
        String strMix = request.getParameter("mix");

        int year = Integer.parseInt(strYear)-Integer.parseInt(strMix);

        response.getWriter().append("rok to: ").append(Integer.toString(year));
    }
}
