package com.nt.dao;

import com.nt.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDAOImpl implements BookDAO {
    @Autowired
    private DataSource ds;
    private static final String INSERT_QUERY="INSSET INTO BOOK VALUES(?,?,?,?)";
    public int insertBook(Book book) {
        int count =0;
        Connection con =null;
        PreparedStatement ps =null;
        try {
            con = ds.getConnection();
            ps =con.prepareStatement(INSERT_QUERY);
           // ps.setString();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
