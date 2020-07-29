package com.bridgelabz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/RegServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeDao employeeDao;
	public void init() {
        employeeDao = new EmployeeDao();
    }
    
    public RegistrationServlet() {
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fullName = request.getParameter("fullName");
        String username = request.getParameter("userName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String contactNumber = request.getParameter("contactNumber");

        Employee employee = new Employee();
        employee.setFullName(fullName);
        employee.setUserName(username);
        employee.setPassword(password);
        employee.setEmail(email);
        employee.setContactNumber(contactNumber);
        try {
			employeeDao.registerEmployee(employee);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        response.sendRedirect("RegSuccess.jsp");
        System.out.println("Employee Registered Successfully");
    }
}
