package dao;

import java.util.List;

import bean.News;

public interface INewsDao {
	
	public List<News> getList() throws NewsDaoException;
	public List<News> getLatestsList(int count) throws NewsDaoException;
	public News fetchById(int id) throws NewsDaoException;
	public int addNews(News news) throws NewsDaoException;
	public void updateNews(News news) throws NewsDaoException;
	public void deleteNews(String[] idNews)throws NewsDaoException;

}
