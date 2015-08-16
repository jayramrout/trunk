package jrout.tutorial.onlineshopping.dao;

import jrout.tutorial.onlineshopping.constants.Constants;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static jrout.tutorial.onlineshopping.constants.Constants.*;

/**
 * Created by Jayram on 8/16/2015.
 */
public class BooksDaoImpl implements BooksDao {

    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public BooksDaoImpl() {
        try {
            Class.forName(Constants.driver);
            con = DriverManager.getConnection(connectionURL, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String> getPublishers() {
        List<String> pname = new ArrayList<>();
        try {
            stmt = con.createStatement();
            String qry = "select pname from books group by pname order by sum(nocs) desc ";
            rs = stmt.executeQuery(qry);
            while (rs.next()) {
                pname.add(rs.getString("pname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return pname;
    }

    @Override
    public List<String> getBooks(String publisherName) {
        List<String> pname = new ArrayList<>();
        try {
            stmt = con.createStatement();
            String qry = "select pname from books group by pname order by sum(nocs) desc ";
            rs = stmt.executeQuery(qry);
            while (rs.next()) {
                pname.add(rs.getString("pname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        return pname;
    }

    /**
     * Method to close the connection after fetching the data.
     */
    private void closeConnection() {
        try {
            if (rs != null)
                rs.close();
            if (stmt != null)
                stmt.close();
            if (con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
