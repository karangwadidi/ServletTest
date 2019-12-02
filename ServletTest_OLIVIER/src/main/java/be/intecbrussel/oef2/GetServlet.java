package be.intecbrussel.oef2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/getServlet")

public class GetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter out=resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Please Enter your name</h1>");
        out.println("<form action=\"queryServlet\">\n" +
                "    Enter a String parameter:<input type=\"text\" name=\"paramname\">\n" +
                "    <input type=\"submit\">\n" +
                "</form>");
        out.println("</body>");
        out.println("</html>");

        RequestDispatcher rd= req.getRequestDispatcher("postServlet");
        rd.forward(req,resp);
        req.setAttribute("k",out);



    }
}
