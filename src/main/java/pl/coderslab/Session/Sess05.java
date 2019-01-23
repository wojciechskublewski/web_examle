package pl.coderslab.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/Sess05")
public class Sess05 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
         String checkSum = request.getParameter("captcha");
         int checkSumInt = Integer.parseInt(checkSum);
         int captcha = (int )session.getAttribute("captcha");

         if (captcha==checkSumInt) {
             response.getWriter().append("DOBRZE!");

         } else {
             response.getWriter().append("ty DEBILU");
         }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        response.setContentType("text/html");
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(100);
        int sum = a+b;
        session.setAttribute("captcha",sum);
        response.getWriter().append("<form method='post'>")
                .append("imie: ").append("<input type='text' name='name''>").append("<br>")
                .append("nazwisko: ").append("<input type='text' name='surname'>").append("<br>")
                .append("mail: ").append("<input type='text' name='mail'>").append("<br>")
                .append("Podaj liczbe z dodawania ").append(Integer.toString(a)).append(" + ").append(Integer.toString(b)).append("<br>")
                .append("captcha: ").append("<input type='number' name='captcha'>").append("<br>")
                .append("<input type='submit'>").append("</form>");


    }
}
