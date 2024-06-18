package ObjetoPersona;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManager {
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public void connect() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users?verifyServerCertificate=false&useSSL=true", "root", "2207");
        con.setAutoCommit(true);
        stmt = con.createStatement();
    }

    public int executeUpdate(String sql) throws Exception {
        return stmt.executeUpdate(sql);
    }

    public ResultSet executeQuery(String sql) throws Exception {
        return stmt.executeQuery(sql);
    }

    public void close() {
        try { if (rs != null) rs.close(); } catch(Exception e) {}
        try { if (stmt != null) stmt.close(); } catch(Exception e) {}
        try { if (con != null) con.close(); } catch(Exception e) {}
    }

    public void setResultSet(ResultSet rs) {
        this.rs = rs;
    }

    public ResultSet getResultSet() {
        return rs;
    }
}

