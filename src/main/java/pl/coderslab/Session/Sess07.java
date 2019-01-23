package pl.coderslab.Session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

@WebServlet("/Sess07")
public class Sess07 extends HttpServlet {

    public String[][] coutry = {{"Niemcy", "Berlin"},{"Czechy", "Praga"},{"Rosja","Moskwa"},{"Francja", "Paryz"} };
    public int sum =0;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        String strCap = request.getParameter("capital");
        Enumeration<String> countryList = session.getAttributeNames();
        String str1 = (String) countryList.nextElement();
        String capCheck = (String) session.getAttribute(str1);

        if (capCheck.equals(strCap)) {
            response.getWriter().append("Dobrze").append("<br>");
            sum++;
        } else {
            response.getWriter().append("zle").append("<br>");
        }
        session.removeAttribute(str1);

        if (countryList.hasMoreElements()) {

            countryList = session.getAttributeNames();
            String str2 = (String) countryList.nextElement();

            response.getWriter().append("Podaj stolicje dla panstwa: ").append(str2);

            response.getWriter().append("<form method='post'>")
                    .append("<input type='text' name='capital'>")
                    .append("<input type='submit'>")
                    .append("</form>");
        } else {
            String result = Integer.toString(sum);
            response.getWriter().append("Twoj wynik to ").append(result);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        sum =0;
        for (int i=0; i<coutry.length; i++) {
            session.setAttribute(coutry[i][0],coutry[i][1]);
        }

        Enumeration<String> countryList = session.getAttributeNames();
        String str1 = (String) countryList.nextElement();

        response.getWriter().append("Podaj stolicje dla panstwa: ").append(str1);

        response.getWriter().append("<form method='post'>")
                .append("<input type='text' name='capital'>")
                .append("<input type='submit'>")
                .append("</form>");


    }
}
