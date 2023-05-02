package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import model.Employee;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("uid"));

		EmployeeDao dao = new EmployeeDao();
		Employee employee = dao.getById(id);

		request.setAttribute("employee", employee);
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("ename");
		String skills = "";

		String skillString[] = request.getParameterValues("skills");
		for (int i = 0; i < skillString.length; i++) {

			if (skills == "") {
				skills = skillString[i];
			} else {
				skills += "," + skillString[i];
			}

		}
		System.out.println(skills);

		int age = Integer.parseInt(request.getParameter("age"));
		double salary = Double.parseDouble(request.getParameter("salary"));
		String joiningdate = request.getParameter("joiningdate");
		Date date = null;
		try {
			date = (Date) new SimpleDateFormat("dd-MMM-yyyy").parse(joiningdate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setEmpName(name);
		employee.setSkill(skills);
		employee.setAge(age);
		employee.setSalary(salary);
		employee.setJoiningDate(date);
		EmployeeDao dao = new EmployeeDao();
		int i = dao.UpdateEmployee(employee);

		if (i > 0) {
			request.setAttribute("employee", new Employee());
			request.setAttribute("msg", "Update successfully done .....");
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
	}

}
