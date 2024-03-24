package ALL.controllers;

import ALL.services.JpaService_post;
        import com.fasterxml.jackson.databind.ObjectMapper;

        import ALL.dao.JpaDAO_post;
        import ALL.services.JpaService;
        import ALL.utils.MSconnector;
        import ALL.utils.mapper_json;

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


@WebServlet(urlPatterns = {"/DispatcherServ/get/*", "/DispatcherServ/getAll", "/DispatcherServ/save/*", "/DispatcherServ/update/*", "/DispatcherServ/delete/*"})
/* */
public class DispatcherServ_jpa extends HttpServlet {
    String json="";//Строка после сериализации



    @Override
    //protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws   ServletException, IOException{
    //protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws   ServletException, IOException{
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws   ServletException, IOException{

        System.out.println("value_sel: "+ req.getServletPath());
        System.out.println("value_get: "+ req.getParameter("id"));

        switch (req.getServletPath()) {
//=======================get=======================================================================
            case  ("/DispatcherServ/get"):
            {
                try {
                    json="";
                    json = new mapper_json().Serialization_in_ISON(new JpaService_post().get(Integer.parseInt(req.getParameter("id"))));
                } catch (Exception e) {e.printStackTrace();}
            }
            break;
//=======================getAll=======================================================================
            case ("/DispatcherServ/getAll"):
            {
                try {
                    json="";
                    json = new mapper_json().Serialization_in_ISON(new JpaService_post().getAll());
                } catch (Exception e) { e.printStackTrace(); }
            }
            break;
//=======================save=======================================================================
            case ("/DispatcherServ/save"):
            {
            //Конячья процетура чьтения из запроса в строку какого-то супер шифрованного запроса(BODY)
                InputStream inputStream = req.getInputStream();
                StringBuilder requestBody = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {requestBody.append(line);}
                String requestBodyString = requestBody.toString();
                System.out.println("Request Body: " + requestBodyString);
            //////////////////////////////////////////////////////////////////////////////////////////

                try {
                    new JpaService_post().save(requestBodyString);
                } catch (Exception e) {e.printStackTrace();}
            }
            break;
//=======================update=======================================================================
            case ("/DispatcherServ/update"):
            {
                //Конячья процетура чьтения из запроса в строку какого-то супер шифрованного запроса(BODY)
                InputStream inputStream = req.getInputStream();
                StringBuilder requestBody = new StringBuilder();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = reader.readLine()) != null) {requestBody.append(line);}
                String requestBodyString = requestBody.toString();
                System.out.println("Request Body: " + requestBodyString);
                //////////////////////////////////////////////////////////////////////////////////////////

                try {
                    new JpaService_post().update(requestBodyString);
                } catch (Exception e) {e.printStackTrace();}
            }
            break;
//=======================delete=======================================================================
            case  ("/DispatcherServ/delete"):
            {
                try {
                    new JpaService_post().delete(Integer.parseInt(req.getParameter("id")));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            break;

            default:
            {System.out.println("ТАКОЙ ЗАПРОС НЕ СУЩЕСТВУЕТ!");}
            break;
        }

        System.out.println(json);
        resp.setHeader("Access-Control-Allow-Origin", "*");
        PrintWriter printWriter = resp.getWriter();
        printWriter.write(json);
        printWriter.close();

    }


}
