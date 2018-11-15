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

/**
 * In this we edit record
 */
@WebServlet(name = "EditRecord",
urlPatterns = "/Edit")
public class EditRecord extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student student=new Student();
        StudentDao studentDao=  new StudentDao();
        int id = Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        int age=Integer.parseInt(request.getParameter("age"));
        student.setId(id);
        student.setAge(age);
        student.setName(name);
        studentDao.updatedata(student);

        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
