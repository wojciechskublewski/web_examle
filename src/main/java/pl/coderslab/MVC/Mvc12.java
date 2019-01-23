package pl.coderslab.MVC;

import org.codehaus.plexus.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Mvc12")
public class Mvc12 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String start = request.getParameter("start");
            String end = request.getParameter("end");



            if(StringUtils.isBlank(end) || StringUtils.isBlank(start)) {
                response.getWriter().append("nie podano parametrow");
            } else {

                int startNum = Integer.parseInt(start)+10;
                int endNum = Integer.parseInt(end)+10;
                request.setAttribute("start",startNum);
                request.setAttribute("end",endNum);
                getServletContext().getRequestDispatcher("/mvc12jsp.jsp").forward(request,response);


            }
    }
}
