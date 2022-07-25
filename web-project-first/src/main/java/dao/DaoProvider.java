package dao;

import dao.impl.NewsDao;
import dao.impl.UserDao;

public final class DaoProvider {
	
	private static final DaoProvider instance = new DaoProvider();
	
	private final IUserDao userDao = new UserDao();
	private final INewsDao newsDao = new NewsDao();
	
	private DaoProvider() {};
	
	public IUserDao getUserDao() {
		return userDao;
	}
	
	public INewsDao getNewsDAO() {
		return newsDao;
	}

	public static DaoProvider getInstance() {
		return instance;
	}
}
