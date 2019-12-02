package be.intecbrussel.oef2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/postServlet")

public class PostServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String injectedParameter =req.getParameter("paramname");
       PrintWriter out=resp.getWriter();
//        out.println(injectedParameter);

        String value= (String) req.getAttribute("k");
        out.println(value);

    }
}
