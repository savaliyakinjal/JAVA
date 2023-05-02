package Controller;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

@WebServlet("/reg")
public class Registrationcontroller extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		
		  Date date = null;
		try {
			date = (Date) new SimpleDateFormat("dd-MMM-yyyy").parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		    System.out.println(dob); 

		User user = new User();
		user.setFirstName(fname);
		user.setLastName(lname);
		user.setEmail(email);
		user.setDob(date);


		UserDao dao = new UserDao();
		int i = dao.addUser(user);
		if (i > 0) {
			request.setAttribute("msg", "Registration successfully done");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
