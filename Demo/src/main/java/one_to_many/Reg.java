package one_to_many;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/regis")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String adds = "";

		String addString[] = request.getParameterValues("add");
		for (int i = 0; i < addString.length; i++) {

			if (adds == "") {
				adds = addString[i];
			} else {
				adds += "," + addString[i];
			}

		}
		Employee employee = new Employee();
		employee.setName(name);

		EmpDao dao = new EmpDao();
		int i = dao.addEmployee(employee);

		if (i > 0) {
			request.setAttribute("msg", "Registration successfully done .....");
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
