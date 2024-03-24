package ALL.dao;

//import com.fasterxml.jackson.core.JsonProcessingException;


import java.io.IOException;
import java.sql.*;
import java.io.*;
import java.util.*;

import ALL.models.users;
import ALL.utils.MSconnector;

import javax.servlet.ServletException;

public class JpaDAO implements DAO<users, Long>{
    Connection connection;

public JpaDAO() throws ServletException, IOException, Exception {
    connection = new MSconnector().MSconnector_TS();//Соединение с БД
}

    @Override
    public Optional<users> get(Long id) throws SQLException {

        String sql = "SELECT * FROM [invest_nv].[dbo].[users] WHERE id=?";
        users user = null;

        PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                user = new users();
               // user.setId(rs.getInt("id"));
                //user.setFirstname(rs.getString("firstname"));
                //user.setLastname(rs.getString("lastname"));
                //user.setStatus(rs.getString("ftatus"));
                user.setId(rs.getInt(1));
                user.setFirstname(rs.getString(2));
                user.setLastname(rs.getString(3));
                user.setStatus(rs.getString(4));
            }
            rs.close();

        // System.out.println("write OK");
            return Optional.ofNullable(user);
    }

    @Override
    public List<users> getAll() throws SQLException {
        String sql = "SELECT * FROM [invest_nv].[dbo].[users]";
        List<users> users = new ArrayList<>();

             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                users user = new users();
                user.setId(rs.getInt(1));
                user.setFirstname(rs.getString(2));
                user.setLastname(rs.getString(3));
                user.setStatus(rs.getString(4));
                users.add(user);
            }

        return users;
    }



}


