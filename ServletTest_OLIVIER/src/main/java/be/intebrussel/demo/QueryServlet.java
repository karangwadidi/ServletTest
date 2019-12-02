package be.intebrussel.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryServlet")

public class QueryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // we try to get the input of the user
//        String injectedParameter=req.getParameter("param");
//        PrintWriter out=resp.getWriter();
//        out.println("result is " +injectedParameter);
//        // on a besoin d'un if si aucun parameter n'est donnné on a que dans le browser
//        //on a "Hello pluto"
//        /*
//        if injectedParameter==null
//         */
        //_________________________________________________________________________
        // ici commence l'experimentation !!!!!!!!!!!!!!!!!!!!!!!!!!!

//        String injectedParameter =req.getParameter("param");
////        PrintWriter out=resp.getWriter();
////        if(injectedParameter==null){
////           // String valueDefault="Hello pluto";
////
////        out.println("result is : Hello pluto ");
////        }
////        else out.println(" result is:" +injectedParameter);

        String injectedParameter =req.getParameter("param");
        PrintWriter out=resp.getWriter();
        if (injectedParameter.isEmpty()){

            out.println("Hello pluto");
        }
        else out.println(" result is:" +injectedParameter);

    }
}
