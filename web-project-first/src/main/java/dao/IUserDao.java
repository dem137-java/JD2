package dao;

import bean.NewUserInfo;

public interface IUserDao {
	
	public boolean logination(String login, String password) throws UserDaoException;
	public boolean registration(NewUserInfo user) throws UserDaoException;
	public String getRole(String login, String password) throws UserDaoException;

}
