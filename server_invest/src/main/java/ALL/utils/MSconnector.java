package ALL.utils;


import java.sql.*;
//import java.io.*;

public class MSconnector {
    String jdbcURL;
    String jdbcUsername;
    String jdbcPassword;
    Connection connection;
    public Connection MSconnector_TS() throws SQLException, ClassNotFoundException, Exception {
        jdbcURL = "jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true";
        jdbcUsername = "mb_user";
        jdbcPassword = "********";

        //Statement stmt;
        //ResultSet rs;
        //System.out.println("con OK_create connect_1");
        //System.out.println("con OK_create connect_2");
        //System.out.println("con OK_create connect_3");

            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());

            connection = DriverManager.getConnection(jdbcURL , jdbcUsername , jdbcPassword);

            //String query = "SELECT * FROM [invest_nv].[dbo].[users]";
            //stmt = connection.createStatement();
            //rs = stmt.executeQuery(query);
            //System.out.println("con OK_4");
             //   while (rs.next()) {
             //       System.out.println(rs.getString(1)+"-"+rs.getString(2));
             //   }
             //   rs.close();
        return connection;
    }
}


        /**/
        /*
//@ApplicationScoped
public class MSconnector {
    String jdbcURL;
    String jdbcUsername;
    String jdbcPassword;
   // Connection jdbcConnection;
    public void MSconnector_TS() throws SQLException, ClassNotFoundException {
        jdbcURL = "jdbc:sqlserver://localhost:1433";
        jdbcUsername = "mb_user";
        jdbcPassword = "**********;

        System.out.println("con OK_1");
        Connection connection;
        Statement stmt;
        ResultSet rs;
        String errMessage = null;

        try {

            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
            System.out.println("con OK_33");
            connection = DriverManager.getConnection(
                    jdbcURL , jdbcUsername , jdbcPassword);
            System.out.println("con OK_3");
            String query = "SELECT * FROM [invest_nv].[dbo].[users]";
            stmt = connection.createStatement();
            rs = stmt.executeQuery(query);
            System.out.println("con OK_4");
            System.out.println(connection.isClosed());
            try {
                while (rs.next()) {
                    System.out.println(rs.getString(1)+"-"+rs.getString(2));
                }
                rs.close();
            } catch (SQLException e) {
                errMessage = e.getMessage();
                System.out.println(errMessage);
            }
            System.out.println("con OK_5");
        } catch (Exception e) {
            errMessage = e.getMessage();
            System.out.println(errMessage);
        }
    }

}
*/





      //  }
        //PARAMETRS connect

    /*
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource dataSource;

    private static final String driver = "org.h2.Driver";
    private static final String jdbcURL = "jdbc:h2:~/test";
    private static final String jdbcUser = "sa";
    private static final String jdbcPass = "";

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        config.setJdbcUrl("jdbc:h2:~/test");
        config.setUsername("sa");
        config.setPassword("");
        config.setConnectionTimeout(50000);
        config.setMaximumPoolSize(100);
        config.setLeakDetectionThreshold(1000);
        dataSource = new HikariDataSource(config);

        try {
            H2dataInitializer.fillTheDB(dataSource.getConnection());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @SneakyThrows
    public Connection getConnection() throws SQLException {
        Class.forName(driver);
        Connection connection = dataSource.getConnection();
        connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
        return connection;
    }
*/

//}