package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;


@WebServlet("/display")
public class Displaycontroller extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserDao dao = new UserDao();
		ArrayList<User> al = dao.getallUsers();

		req.setAttribute("data", al);
		req.getRequestDispatcher("home.jsp").forward(req, resp);
	}

}
