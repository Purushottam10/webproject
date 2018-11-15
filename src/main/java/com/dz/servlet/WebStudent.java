package com.dz.servlet;

import com.dz.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "WebStudent",urlPatterns = "/Web")
public class WebStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choice=request.getParameter("student");
               // WebStudent webStudent=new WebStudent();
        //Student student = new Student();
        if(choice.equals("AddData"))
        {
            RequestDispatcher requestDispatcher=request.getServletContext().getRequestDispatcher("/AddData.jsp");
            requestDispatcher.forward(request,response);
                    }
        if(choice.equals("Delete"))
        {
            RequestDispatcher requestDispatcher=request.getServletContext().getRequestDispatcher("/Delete.jsp");
            requestDispatcher.forward(request,response);
                    }
        if(choice.equals("DisplayData"))
        {
            RequestDispatcher requestDispatcher=request.getServletContext().getRequestDispatcher("/DisplayData.jsp");
            requestDispatcher.forward(request,response);
        }
        if(choice.equals("Update"))
        {
            RequestDispatcher requestDispatcher=request.getServletContext().getRequestDispatcher("/Update.jsp");
            requestDispatcher.forward(request,response);
                    }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
