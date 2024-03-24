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
}

//=======================get=======================================================================
    @Override
    public Optional<post> get(Long id) throws SQLException {

        String sql = "SELECT * FROM [invest_nv].[dbo].[post] WHERE id=?";
        post post_map = null;

        PreparedStatement ps = connection.prepareStatement(sql);
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();

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

            return Optional.ofNullable(post_map);
    }

//=======================getAll=======================================================================
    @Override
    public List<post> getAll() throws SQLException {
        String sql = "SELECT * FROM [invest_nv].[dbo].[post]";
        List<post> post = new ArrayList<>();

             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                post post_map = new post();
                post_map.setUserId(rs.getInt(1));
                post_map.setId(rs.getInt(2));
                post_map.setTitle(rs.getString(3));
                post_map.setBody(rs.getString(4));
                post.add(post_map);
            }

        return post;
    }

//=======================save=======================================================================
    @Override
    public void save(post post) throws SQLException {
        String sql = "INSERT INTO [invest_nv].[dbo].[post] (userId, id,title,body) VALUES (?,?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, post.getUserId());
        statement.setLong(2, post.getId());
        statement.setString(3, post.getTitle());
        statement.setString(4, post.getBody());

        statement.executeUpdate();
    }

//=======================update=======================================================================
    @Override
    public void update(post post) throws SQLException {
        String sql = "UPDATE [invest_nv].[dbo].[post] SET userId=?, title=?, body=? WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, post.getUserId());
        statement.setString(2, post.getTitle());
        statement.setString(3, post.getBody());
        statement.setLong(4, post.getId());

        statement.executeUpdate();
    }

//=======================getAll=======================================================================
    @Override
    public void delete(Long id) throws SQLException {
        String sql = "DELETE FROM [invest_nv].[dbo].[post] WHERE id=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, id);

        statement.executeUpdate();
    }



}


