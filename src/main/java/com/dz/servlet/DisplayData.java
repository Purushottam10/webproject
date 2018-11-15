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
import java.util.List;
import java.util.logging.Logger;

/**
 * in this we display our data use of doget method
 */
@WebServlet(name = "Displaydata",urlPatterns = "/Display")
public class DisplayData extends HttpServlet {
    private Logger logger=Logger.getLogger("DisplayDataServlet.class");

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StudentDao studentDao=new StudentDao();
        List<Student>studentList=studentDao.display();
     if(request.getParameter("show")!="show") {
    request.setAttribute("studentlist", studentList);
   /* for (Student stu : studentList) {
        System.out.println(stu.toString());
    }*/
    RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/DisplayData.jsp");
    requestDispatcher.forward(request, response);
    }
    if(request.getParameter("Adddata").equals("AddData"));
        {
            System.out.println("ghjkgggggggg");
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/AddStudent.jsp");
            requestDispatcher.forward(request, response);
        }
    }

}
