package pl.coderslab.Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/Get2")
public class Get2 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Map<String,String[]> param = request.getParameterMap();

        for (String key : param.keySet()) {
            response.getWriter().append(key)
                    .append(" : ")
                    .append(Arrays.toString(param.get(key)))
                    .append("<br>");
        }

    }
}
