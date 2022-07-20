

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FrontController() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (request.getParameter("command").equalsIgnoreCase("authorization")) {
			request.getRequestDispatcher("jsp/authorization.jsp").forward(request, response);
		} else if (request.getParameter("command").equalsIgnoreCase("registration")) {
			request.getRequestDispatcher("jsp/registration.jsp").forward(request, response);
		}
	}
}