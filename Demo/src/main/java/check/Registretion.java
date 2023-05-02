package check;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class Registretion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

//		String skills = Stream.of(request.getParameter("skills")).filter(Objects::nonNull)
//				.collect(Collectors.joining(","));
//		System.out.println(skills);
	}

}
