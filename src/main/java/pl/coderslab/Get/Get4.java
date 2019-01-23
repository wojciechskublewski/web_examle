package pl.coderslab.Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get4")
public class Get4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String strNum = request.getParameter("number");
        try {
            int num = Integer.parseInt(strNum);

            for (int i=1; i<=num; i++) {
                if (num%i==0) {
                    response.getWriter().append(Integer.toString(i)).append(", ");
                }
            }

        } catch (Exception e) {
            response.getWriter().append("to nie jest liczba");
        }


    }
}
