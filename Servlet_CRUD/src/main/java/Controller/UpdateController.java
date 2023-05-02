package Controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/update")
public class UpdateController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("uid"));

		UserDao dao = new UserDao();
		User us = dao.getById(id);

		req.setAttribute("user", us);
		req.getRequestDispatcher("update.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int id = Integer.parseInt(req.getParameter("id"));
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");

		Date date = null;

		try {
			date = (Date) new SimpleDateFormat("dd-MMM-yyyy").parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		User user = new User();
		user.setUserid(id);
		user.setFirstName(fname);
		user.setLastName(lname);
		user.setEmail(email);
		user.setDob(date);

		UserDao dao = new UserDao();
		int i = dao.UpdateUser(user);
		if (i > 0) {
			req.setAttribute("user", new User());
			req.setAttribute("msg", "update successfully done");
			req.getRequestDispatcher("update.jsp").forward(req, resp);
		}
	}

}
