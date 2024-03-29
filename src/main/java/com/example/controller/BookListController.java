package com.example.controller;
// Servlet의 기본 골격

import com.example.entity.BoardDTO;
import com.example.entity.BookDTO;
import com.example.repository.BookDAO;
import com.example.repository.BookMyBatisDAO;
import com.google.gson.Gson;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// http://localhost:8081/shopping/list -----> /WEB-INF/views/list.jsp
//@WebServlet("/list")
public class BookListController  implements  Controller{ // BookListController(Servet)--->POJO

    public String requestHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BookMyBatisDAO dao=new BookMyBatisDAO();
        List<BookDTO> list=dao.bookList();
        req.setAttribute("list",list );

        return "list";
    }
}
