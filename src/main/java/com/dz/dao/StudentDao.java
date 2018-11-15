package com.dz.dao;

import com.dz.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StudentDao {
    private DBConfig dbConfig;
    private Connection connection;
    private Student student;
    private PreparedStatement statement=null;
    private static Logger logger = Logger.getLogger(StudentDao.class.getName());

    /**
     * IN this we add data in list
     * @param student
     * @return
     * @throws SQLException
     */
    public int addStudent(Student student) throws SQLException {
        int stu_id = 0;
        try {

            dbConfig = new DBConfig();
            connection = dbConfig.getConnection();
            Statement statement = null;

            try {
                statement = connection.createStatement();
                ResultSet rs = statement.executeQuery("select max(Id) from STUDENT_DATA ");


                if (rs.next()) {
                    stu_id = rs.getInt(1) + 1;
                    student.setId(stu_id);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            System.out.println("insert into student_data(id,name,age)" + " values(" + stu_id + "," + "'" + student.getName() + "'," + student.getAge() + ");");
            int count = statement.executeUpdate(String.format("insert into STUDENT_DATA(id,name,age)" + " values(" + stu_id + "," + "'" + student.getName() + "'," + student.getAge() + ");"));
            logger.info(count + " row inserted");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stu_id;

    }

    public List<Student> display()

    {
/**
 * In this we display our list
 */
        List<Student>studentList=new ArrayList<>();
        try {

            Connection connection = dbConfig.getConnection();
            Statement st = connection.createStatement();

            String n = null;
            ResultSet rs = st.executeQuery("select * from STUDENT_DATA");
            System.out.println("STUDENT DATA");
            while (rs.next()) {
                student=new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setAge(rs.getInt(3));
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));

                studentList.add(student);
            }
            return studentList;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;


    }

    /**
     * In this we delete data
     * @param stu_id
     * @return
     */
    public  int deletedata(int stu_id)
    {
                try {
            DBConfig dBconfig = new DBConfig();
            Connection connection = dBconfig.getConnection();
            Statement statement = connection.createStatement();
                       int count = statement.executeUpdate(String.format("DELETE FROM STUDENT_DATA where id=" + stu_id + ";"));
      logger.info(count + " record deleted");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
return stu_id;
    }

    /**
     *in this we update data
     * @param student
     * @return
     */
    public boolean updatedata(Student student)
    {
        int count=0;


        DBConfig dBconfig = new DBConfig();
        Connection connection = dBconfig.getConnection();
        System.out.println(connection);

        try {

            statement = connection.prepareStatement("update STUDENT_DATA  set name=? ,age=? where id =?");
            statement.setString(1, student.getName());
            statement.setInt(2, student.getAge());
            statement.setInt(3, student.getId());
            count = statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (count > 0) {
           logger.info("updated");
            return true;
        }

        return false;
    }

}