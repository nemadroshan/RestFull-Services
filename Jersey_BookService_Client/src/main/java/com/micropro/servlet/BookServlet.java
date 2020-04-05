package com.micropro.servlet;

import com.micropo.model.Book;
import com.micropo.responseDto.ResponseDTO;
import com.micropro.client.BookServiceClient;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/bookServlet")
public class BookServlet extends HttpServlet {
    private BookServiceClient client =null;

    @Override
    public void init() throws ServletException {
        client = new BookServiceClient();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Book book = new Book();
        String author = request.getParameter("author");
        String title = request.getParameter("title");
        String isbn = request.getParameter("isbn");
        double price = Double.parseDouble(request.getParameter("price"));
        book.setAuthor(author);book.setIsbn(isbn);book.setPrice(price);book.setTitle(title);
        ResponseDTO responseDTO = client.saveBookDetail(book);
        request.setAttribute("responseDTO",responseDTO);
        String target ="/WEB-INF/pages/regBook.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(target);
        rd.forward(request,response);
    }
}
