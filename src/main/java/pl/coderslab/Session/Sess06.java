package pl.coderslab.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/Sess06")
public class Sess06 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        String dodawanie = request.getParameter("dodawanie");
        int dodawanieNum = Integer.parseInt(dodawanie);
        String odejmowanie = request.getParameter("odejmowanie");
        int odejmowanieNum = Integer.parseInt(odejmowanie);
        String mnozenie = request.getParameter("mnozenie");
        int mnozenieNum = Integer.parseInt(mnozenie);

        int aNum = (int) session.getAttribute("aNum");
        int bNum = (int) session.getAttribute("bNum");

        String str1="";
        String str2="";
        String str3="";

        if (dodawanieNum==(aNum+bNum)){
            str1="ok";
        }else {
            str1="zle";
        }

        if (odejmowanieNum==(aNum-bNum)){
            str2="ok";
        }else {
            str2="zle";
        }

        if (mnozenieNum==(aNum*bNum)){
            str3="ok";
        }else {
            str3="zle";
        }

        response.getWriter().append("wynik dodawania: ").append(str1).append("<br>")
                .append("wynik odejmowania: ").append(str2).append("<br>")
                .append("wynik mnozenia: ").append(str3).append("<br>");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();

        int a = new Random().nextInt(40);
        int b = new Random().nextInt(40);

        session.setAttribute("aNum",a);
        session.setAttribute("bNum",b);

        response.getWriter().append("<form method='post'>")
                .append("Podaj wyniki dzialana na liczbach: ").append(Integer.toString(a)).append(" i ").append(Integer.toString(b)).append("<br>")
                .append("dodawanie: ").append("<input type='number' name='dodawanie'>")
                .append("<br>")
                .append("odejmowanie: ").append("<input type='number' name='odejmowanie'>").append("<br>")
                .append("mnozenie: ").append("<input type='number' name='mnozenie'>").append("<br>")
                .append("<input type='submit'>")
                .append("</form>");



    }
}
