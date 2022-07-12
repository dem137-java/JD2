

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Registration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.println("Congratulations, new user is registered");
		writer.append("Your name is: ").append(request.getParameter("name")).append("\n");
		writer.append("Your surname is: ").append(request.getParameter("surname")).append("\n");
		writer.append("Date of your Birthday: ").append(request.getParameter("birthDate")).append("\n");
		writer.append("Preferable contacts: ");
		String [] contacts = request.getParameterValues("contact");
		for (int i=0; i<contacts.length;i++) {
			writer.append(contacts[i]);
			if (i!=contacts.length-1) {
				writer.append(",");
			}
		}
		writer.append("\n");
		writer.append("Your login is: ").append(request.getParameter("login")).append("\n");
		writer.append("Your password is: ").append(request.getParameter("password")).append("\n");
		writer.close();
	}

}
