package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;


@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("did"));

		UserDao dao = new UserDao();
		int i = dao.delete(id);

		if (i > 0) {
			request.getRequestDispatcher("display").forward(request, response);
		}
	}

}
