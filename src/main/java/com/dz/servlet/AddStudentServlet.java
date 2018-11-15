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

/**
 * in this we add student record use of doget method
 */
@WebServlet(name = "AddStudentServlet",urlPatterns = "/AddStudent")
public class AddStudentServlet extends HttpServlet {
    private Logger logger=Logger.getLogger("AddStudentServlet.class");
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    Student student=new Student();
    StudentDao studentDao = new StudentDao();

         try {
             String name = request.getParameter("name");
             int age = Integer.parseInt(request.getParameter("age"));
             System.out.println("Servlet Class set the value ");
             student.setAge(age);
             student.setName(name);
             studentDao.addStudent(student);
         }catch (Exception e)
         {
             e.printStackTrace();
         }
        RequestDispatcher requestDispatcher=request.getServletContext().getRequestDispatcher("/index.jsp");
    requestDispatcher.forward(request,response);
    }
}
