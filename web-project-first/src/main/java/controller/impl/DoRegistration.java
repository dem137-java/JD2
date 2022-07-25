package controller.impl;

import java.io.IOException;

import controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.IUserService;
import service.ServiceProvider;

public class DoRegistration implements Command {
	
	private final IUserService userService = ServiceProvider.getInstance().getUserService();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String dateOfBirth = request.getParameter("birthDate");
		String eMail = request.getParameter("e-mail"); 
		String mobileNo = request.getParameter("mobileNo");
		String [] contacts = request.getParameterValues("contact");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		

	}

}
