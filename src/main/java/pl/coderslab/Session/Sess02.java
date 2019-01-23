package pl.coderslab.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Sess02")
public class Sess02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int sum =0;
        HttpSession session = request.getSession();
        String strNum = request.getParameter("number");
        List<Integer> numbers;

        if (session.getAttribute("number")==null) {
            numbers = new ArrayList<>();
        } else {
            numbers = (List<Integer>) session.getAttribute("number");
        }


        numbers.add(Integer.parseInt(strNum));

        session.setAttribute("number",numbers);



        response.setContentType("text/html");
        response.getWriter().append("<form method='post'>").
                append("<label>").
                append("liczba sesji:<input type'text' name='number'>")
                .append("</label>")
                .append("<input type='submit'>")
                .append("</form>")
                .append("<br>");



    for (int i=0; i<=numbers.size();i++) {
        response.getWriter().append(Integer.toString(numbers.get(i))).append(" ");
    }





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");


        response.getWriter().append("<form method='post'>").
                append("<label>").
                append("liczba sesji:<input type'text' name='number'>")
                .append("</label>")
                .append("<input type='submit'>")
                .append("</form>")
                .append("<br>");

    }


}
