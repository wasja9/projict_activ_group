package ALL.controllers;

import ALL.services.JpaService_post;
import com.fasterxml.jackson.databind.ObjectMapper;

import ALL.dao.JpaDAO_post;
import ALL.services.JpaService;
import ALL.utils.MSconnector;

import javax.persistence.Id;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.io.*;



import javax.servlet.annotation.WebServlet;////!!!!!!!!!!!!!

//@WebServlet("/DispatcherServ_TS/{id_1}")
@WebServlet("/DispatcherServ_TS")
public class DispatcherServ_TS extends HttpServlet {
    String str_out;
    String json2;
    String json3;
    /* */

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws   ServletException, IOException, IOException {
        //response.header('Access-Control-Allow-Origin', '*');
        //@PathVariable(value = "id");
        //request.getRequestURI().equals("/111");
        // request.getRequestDispatcher("/test.jsp").forward(request, response);
        //System.out.println("Test INPUT value :" + @PathParam("id"));
        try {

            System.out.println("eeeeeeeeeeeeeeeeeeee");

            ObjectMapper mapper2 = new ObjectMapper();
            json2 = mapper2.writeValueAsString(new JpaService_post().get(1));
            System.out.println(json2);

            System.out.println("BBBBBBBBBBBBBBBBBBBB");

            ObjectMapper mapper3 = new ObjectMapper();
            json3 = mapper3.writeValueAsString(new JpaService_post().getAll());
            System.out.println(json3);


        } catch (Exception e) {e.printStackTrace();}
        System.out.println("HELLO!!! DispatcherServ1");
        response.setContentType("text/html");

        response.setHeader("Access-Control-Allow-Origin", "*");

        PrintWriter printWriter = response.getWriter();

        printWriter.write(json3);

        printWriter.close();

    }


}





