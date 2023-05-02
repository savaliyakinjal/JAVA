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

@WebServlet("/reg")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		List<Skills> skills = new ArrayList<Skills>();

		System.out.println("start Reg Con..........");
		String name = request.getParameter("ename");
		String skills = "";

		String skillString[] = request.getParameterValues("skills");
		for (int i = 0; i < skillString.length; i++) {

//			skills.add(skillString[i]);

			if (skills == "") {
				skills = skillString[i];
			} else {
				skills += "," + skillString[i];
			}

//			SkillsDao sDao = new SkillsDao();
//			sDao.addSkill(skills);
		}
		System.out.println(skills);

//		for (Iterator iterator = skills.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//
//		}

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
		employee.setEmpName(name);
		employee.setSkill(skills);
		employee.setAge(age);
		employee.setSalary(salary);
		employee.setJoiningDate(date);
		System.out.println("end Reg Con..........");
		EmployeeDao dao = new EmployeeDao();
		int i = dao.addEmployee(employee);
		System.out.println("i= " + i);
		if (i > 0) {
			request.setAttribute("msg", "Registration successfully done .....");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
