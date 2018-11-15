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

@WebServlet(name = "Delete",urlPatterns = "/delete")
public class Delete extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int id=Integer.parseInt(request.getParameter("id"));
        StudentDao studentDao=new StudentDao();
        studentDao.deletedata(id);
        RequestDispatcher requestDispatcher=request.getServletContext().getRequestDispatcher("/DisplayData.jsp");
        requestDispatcher.forward(request,response);
    }
}
