package com.dz.servlet;

import com.dz.dao.StudentDao;
import com.dz.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name = "UpdateRecord",urlPatterns = "/Update")
public class UpdateRecord extends HttpServlet {
   // private Logger logger = Logger.getLogger(UpdateRecord.class);

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Student student = new Student();
        StudentDao studentDao = new StudentDao();

        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("id",id);
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/Update.jsp");
        requestDispatcher.forward(request, response);


    }
    }

