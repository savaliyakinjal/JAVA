package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import model.Student;


@WebServlet("/reg")
public class Registrationcontroller extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String phno = request.getParameter("phno");

		Student st = new Student();
		st.setFname(fname);
		st.setLname(lname);
		st.setEmail(email);
		st.setPass(pass);
		st.setPhno(phno);

		StudentDao dao = new StudentDao();
		int i = dao.addStudent(st);
		if (i > 0) {
			request.setAttribute("msg", "Registration successfully done");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
