package ALL.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.*;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by nvl on 07.02.2024.
 */
//@WebServlet("/get_RestControoler","/selct")//Путь к сервлету из адресной страницы
//@WebServlet("/select")

//@WebServlet("select", "insert", "delete")
//@Path("/get_RestControoler")//Путь к сервлету из адресной страницы
//@WebServlet(urlPatterns = {"/select", "/insert", "/delete/{id}"})
//@WebServlet(urlPatterns = {"/delete/"})
//@WebServlet(urlPatterns = {"/delete/{id}"})
@WebServlet(urlPatterns = {"/delete/*"})

public class RestController_test extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println(req.getServletPath());

        String idstr1 = req.getParameter("id");
        System.out.println("value1: "+ idstr1);

        //System.out.println("rec_PATCH: "+ req.getServletPath());
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("'[{'userId': 1,'id': 1,'title': 'eprehenderit','body': 'architecto'}]'");

        printWriter.close();
        System.out.println("HELLO!!! get_RestControoler /select");

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println(req.getServletPath());

        String idstr1 = req.getParameter("id");
        System.out.println("value1: "+ idstr1);


        //System.out.println("rec_PATCH: "+ req.getServletPath());
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write("'[{'userId': 1,'id': 1,'title': 'eprehenderit','body': 'architecto'}]'");

        printWriter.close();
        System.out.println("HELLO!!! get_RestControoler /select");




    }

}

//@RequestMapping("/speculation")
//public class ProductController {
//}
