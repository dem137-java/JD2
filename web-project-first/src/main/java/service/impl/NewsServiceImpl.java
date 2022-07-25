package service.impl;

import java.util.List;

import bean.News;
import dao.DaoProvider;
import dao.INewsDao;
import dao.NewsDaoException;
import service.INewsService;
import service.ServiceException;

public class NewsServiceImpl implements INewsService{
	
private final INewsDao newsDAO = DaoProvider.getInstance().getNewsDAO();
	
	@Override
	public void save() {
		// TODO Auto-generated method stub
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<News> latestList(int count) throws ServiceException {
		
		try {
			return newsDAO.getLatestsList(5);
		} catch (NewsDaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public List<News> list() throws ServiceException {
		try {
			return newsDAO.getList();
		} catch (NewsDaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public News findById(int id) throws ServiceException {
		try {
			return newsDAO.fetchById(id);
		} catch (NewsDaoException e) {
			throw new ServiceException(e);
		}
	}
}
