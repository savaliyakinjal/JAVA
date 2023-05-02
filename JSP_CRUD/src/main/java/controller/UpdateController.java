package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import model.Student;


@WebServlet("/update")
public class UpdateController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("uid"));

		StudentDao dao = new StudentDao();
		Student st = dao.getById(id);

		req.setAttribute("std", st);
		req.getRequestDispatcher("update.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String phno = req.getParameter("phno");

		Student st = new Student();
		st.setId(id);
		st.setFname(fname);
		st.setLname(lname);
		st.setEmail(email);
		st.setPass(pass);
		st.setPhno(phno);

		StudentDao dao = new StudentDao();
		int i = dao.UpdateStudent(st);
		if (i > 0) {
			req.setAttribute("std", new Student());
			req.setAttribute("msg", "update successfully done");
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
	}

}
