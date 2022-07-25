package service;

import java.util.List;

import bean.News;

public interface INewsService {
	public void save() throws ServiceException;
	public void find() throws ServiceException;
	public void update() throws ServiceException;
	  
	public List<News> latestList(int count)  throws ServiceException;
	public List<News> list()  throws ServiceException;
	public News findById(int id) throws ServiceException;

}
