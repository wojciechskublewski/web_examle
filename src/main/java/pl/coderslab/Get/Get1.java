package pl.coderslab.Get;

import jdk.nashorn.internal.ir.IfNode;
import org.codehaus.plexus.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get1")
public class Get1 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String start = request.getParameter("start");
        String end = request.getParameter("end");

        if(StringUtils.isBlank(start) || StringUtils.isBlank(end)) {
            response.getWriter().append("nie ma parametrow");
            return;
        }

        try {

            int startNum = Integer.parseInt(start);
            int endNum = Integer.parseInt(end);

            response.getWriter().append("start: ").append(start)
                    .append("<br>")
                    .append("end: ").append(end);

        } catch (Exception e) {
            response.getWriter().append("nie podano parametrow lub liczb naturalnych");
        }






    }


}
