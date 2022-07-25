package controller.impl;

import java.io.IOException;
import java.util.List;

import bean.News;
import controller.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.INewsService;
import service.ServiceException;
import service.ServiceProvider;

public class GoToNewsList implements Command{
	
	private final INewsService newsService = ServiceProvider.getInstance().getNewsService();
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<News> newsList;
		
		try {
			newsList = newsService.list();
			request.setAttribute("news", newsList);
			request.setAttribute("presentation", "newsList");

			request.getRequestDispatcher("WEB-INF/pages/layouts/baseLayout.jsp").forward(request, response);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
