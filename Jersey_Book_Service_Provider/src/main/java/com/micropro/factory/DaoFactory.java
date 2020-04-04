package com.micropro.factory;

import com.micropro.dao.BookDAO;
import com.micropro.dao.BookDAOImpl;

public class DaoFactory {
    private static BookDAO dao =null;
    static {
         dao = new BookDAOImpl();
    }
    public static BookDAO getDao() {
        return dao;
    }
}
