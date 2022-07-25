package dao.impl;

import bean.NewUserInfo;
import dao.IUserDao;
import dao.UserDaoException;

public class UserDao implements IUserDao{

	@Override
	public boolean logination(String login, String password) throws UserDaoException {
		
		/*
		 * Random rand = new Random(); int value = rand.nextInt(1000);
		 * 
		 * if(value % 3 == 0) { try { throw new SQLException("stub exception");
		 * }catch(SQLException e) { throw new DaoException(e); } }else if (value % 2 ==
		 * 0) { return true; }else { return false; }
		 */
		return true;
	}
	
	public String getRole(String login, String password) {
		return "user";
	}

	@Override
	public boolean registration(NewUserInfo user) throws UserDaoException  {
		// TODO Auto-generated method stub
		return false;
	}

}
