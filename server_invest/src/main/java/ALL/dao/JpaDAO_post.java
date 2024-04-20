package ALL.dao;

import ALL.models.post;
import ALL.utils.MSconnector;

import javax.servlet.ServletException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JpaDAO_post implements DAO_full<post, Long>{
    Connection connection;

public JpaDAO_post() throws ServletException, IOException, Exception {
    connection = new MSconnector().MSconnector_TS();//Соединение с БД
//    connection.setAutoCommit(false);
}

//=======================get=======================================================================
    @Override
    public Optional<post> get(Long id) throws SQLException {
        post post_map = null;
        try {
            post_map = null;
            connection.setAutoCommit(false);
            String sql = "SELECT * FROM [invest_nv].[dbo].[post] WHERE id=?";

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet rs = null;
            rs = ps.executeQuery();
            connection.commit();// Завершение транзакции
            connection.setAutoCommit(true);// Восстановление по умолчанию
                while (rs.next()) {
                    post_map = new post();
                   // user.setId(rs.getInt("id"));
                    //user.setFirstname(rs.getString("firstname"));
                    //user.setLastname(rs.getString("lastname"));
                    //user.setStatus(rs.getString("ftatus"));
                    post_map.setUserId(rs.getInt(1));
                    post_map.setId(rs.getInt(2));
                    post_map.setTitle(rs.getString(3));
                    post_map.setBody(rs.getString(4));
                }
                rs.close();
        } catch (SQLException e) {connection.rollback();e.printStackTrace();}

            return Optional.ofNullable(post_map);
    }

//=======================getAll=======================================================================
    @Override
    public List<post> getAll() throws SQLException {
        List<post> post = null;
        post post_map = null;
        try {
            post_map = null;
            connection.setAutoCommit(false);
            String sql = "SELECT * FROM [invest_nv].[dbo].[post]";
            post = new ArrayList<>();

            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            connection.commit();// Завершение транзакции
            connection.setAutoCommit(true);// Восстановление по умолчанию
            while (rs.next()) {
                post_map = new post();
                post_map.setUserId(rs.getInt(1));
                post_map.setId(rs.getInt(2));
                post_map.setTitle(rs.getString(3));
                post_map.setBody(rs.getString(4));
                post.add(post_map);
            }
            rs.close();
        } catch (SQLException e) {connection.rollback();e.printStackTrace();}
        return post;
    }

//=======================save=======================================================================
    @Override
    public void save(post post) throws SQLException {
        try {
            connection.setAutoCommit(false);
            String sql = "INSERT INTO [invest_nv].[dbo].[post] (userId, id,title,body) VALUES (?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, post.getUserId());
            statement.setLong(2, post.getId());
            statement.setString(3, post.getTitle());
            statement.setString(4, post.getBody());
            System.out.println(post.getUserId()+":"+post.getId()+":"+post.getTitle()+":"+post.getBody());

            statement.executeUpdate();
            connection.commit();// Завершение транзакции
            connection.setAutoCommit(true);// Восстановление по умолчанию
        } catch (SQLException e) {connection.rollback();e.printStackTrace();}
    }

//=======================update=======================================================================
    @Override
    public void update(post post) throws SQLException {
        try {
            connection.setAutoCommit(false);
            String sql = "UPDATE [invest_nv].[dbo].[post] SET userId=?, title=?, body=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, post.getUserId());
            statement.setString(2, post.getTitle());
            statement.setString(3, post.getBody());
            statement.setLong(4, post.getId());

            statement.executeUpdate();
            connection.commit();// Завершение транзакции
            connection.setAutoCommit(true);// Восстановление по умолчанию
        } catch (SQLException e) {connection.rollback();e.printStackTrace();}
    }

//=======================getAll=======================================================================
    @Override
    public void delete(Long id) throws SQLException {
        try {
            connection.setAutoCommit(false);
            String sql = "DELETE FROM [invest_nv].[dbo].[post] WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, id);

            statement.executeUpdate();
            connection.commit();// Завершение транзакции
            connection.setAutoCommit(true);// Восстановление по умолчанию
        } catch (SQLException e) {connection.rollback();e.printStackTrace();}
    }



}


