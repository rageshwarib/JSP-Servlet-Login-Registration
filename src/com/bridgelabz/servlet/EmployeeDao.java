package com.bridgelabz.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
        String query = "INSERT INTO employee" +
                "  (id, fullName, userName, password, email, contactNumber) VALUES " +
                " (?, ?, ?, ?, ?,?);";

        int result = 0;

        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/Employee", "root", "root");

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, employee.getFullName());
            preparedStatement.setString(3, employee.getUserName());
            preparedStatement.setString(4, employee.getPassword());
            preparedStatement.setString(5, employee.getEmail());
            preparedStatement.setString(6, employee.getContactNumber());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
        }
        return result;
    }

}
