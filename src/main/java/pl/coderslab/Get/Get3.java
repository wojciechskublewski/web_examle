package pl.coderslab.Get;

import org.codehaus.plexus.util.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get3")
public class Get3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        int width = 5;
        int height =10;

        String strWidth = request.getParameter("width");
        String strHeight = request.getParameter("height");


        if (StringUtils.isBlank(strHeight)|| StringUtils.isBlank(strWidth)) {
            for (int i =1; i<=width; i++ ){
                for (int j =1; j<=height; j++){
                    response.getWriter().append(Integer.toString(i*j)).append(", ");

                }
                response.getWriter().append("<br>");
            }
        } else {
            try {

                width = Integer.parseInt(strWidth);
                height = Integer.parseInt(strHeight);
                for (int i =1; i<=width; i++ ){
                    for (int j =1; j<=height; j++){
                        response.getWriter().append(Integer.toString(i*j)).append(", ");

                    }
                    response.getWriter().append("<br>");
                }


            } catch (Exception e) {
                response.getWriter().append("Zle dane wejsciowe");
            }

        }
    }



}
