package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.StudentDao;
import model.Student;

/**
 * Servlet implementation class Logincontroller
 */
@WebServlet("/login")
public class Logincontroller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");

		Student std = new Student();
		std.setEmail(email);
		std.setPass(pass);

		StudentDao dao = new StudentDao();
		boolean b = dao.logincheck(std);

		if (b) {
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			request.getRequestDispatcher("display").forward(request, response);

		} else {
			request.setAttribute("msg", "Invalid username or password");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	}

}
