package DatabaseLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DBConnection {

    private final String URL = "jdbc:sqlserver://localhost:1433;databaseName=master";
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String user = "danuja";
    String pass = "cricket14";

    private Connection con;
    private static DBConnection instance;
    ResultSet rs;
    PreparedStatement pst;

    private DBConnection() {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static DBConnection getSingleInstance() {
        try {
            if (instance == null) {
                instance = new DBConnection();
                return instance;
            } else if (instance.con.isClosed()) {
                instance = new DBConnection();
                return instance;
            } else {
                return instance;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean ExecuteQuery(String Query) {
        try {
            Statement st = con.createStatement();
            int result = st.executeUpdate(Query);
            return (result > 0);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public ResultSet Fetch(String Query) {

        try {
            pst = con.prepareStatement(Query);
            rs = pst.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return rs;

    }

}
