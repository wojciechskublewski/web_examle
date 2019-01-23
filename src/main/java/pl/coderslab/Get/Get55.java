package pl.coderslab.Get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/Get55")
public class Get55 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        Map<String, String[]> strLang = request.getParameterMap();

        for (String key : strLang.keySet()) {
            response.getWriter().append(key).append("<br>");
            response.getWriter().append(Arrays.toString(strLang.get(key))).append("<br>");
        }


    }
}
