package service.impl;

import bean.NewUserInfo;
import dao.DaoProvider;
import dao.IUserDao;
import dao.UserDaoException;
import service.IUserService;
import service.ServiceException;

public class UserServiceImpl implements IUserService{

	private final IUserDao userDAO = DaoProvider.getInstance().getUserDao();
	
//	private final UserDataValidation userDataValidation = ValidationProvider.getIntsance().getUserDataVelidation();
	
	@Override
	public String signIn(String login, String password) throws ServiceException {
		
		/*
		 * if(!userDataValidation.checkAUthData(login, password)) { throw new
		 * ServiceException("login ...... "); }
		 */
		
		try {
			if(userDAO.logination(login, password)) {
				return userDAO.getRole(login, password);
			}else {
				return "guest";
			}
			
		}catch(UserDaoException e) {
			throw new ServiceException(e);
		}
		
	}

	@Override
	public boolean registration(NewUserInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

}
