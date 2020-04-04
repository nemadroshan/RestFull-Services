package com.micropro.dao;
import com.micropo.model.Book;
import com.micropro.factory.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDAOImpl implements BookDAO {
    private static final String INSERT_QUERY ="INSERT INTO BOOK VALUES(?,?,?,?)";
    @Override
    public int registerBook(Book book) throws Exception {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement ps =  con.prepareStatement(INSERT_QUERY);
        int count =0;
        ps.setString(1,book.getIsbn());
        ps.setString(2,book.getAuthor());
        ps.setDouble(3,book.getPrice());
        ps.setString(4,book.getTitle());
        count = ps.executeUpdate();
        return count;
    }
}
