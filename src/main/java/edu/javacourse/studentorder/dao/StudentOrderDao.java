package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.DaoException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface StudentOrderDao {

    Long saveStudentOrder (StudentOrder so) throws DaoException;
    List<StudentOrder> getStudentOrders () throws DaoException;




}
