package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import model.Employee;

@WebServlet("/display")
public class Displaycontroller extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDao();
		ArrayList<Employee> al = dao.getallEmployee();

		req.setAttribute("data", al);
		req.getRequestDispatcher("view.jsp").forward(req, resp);
	}

}
