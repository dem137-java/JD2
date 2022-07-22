package service;

import bean.NewUserInfo;

public interface UserService {
	public boolean logination (String login, String password);
	public boolean registration (NewUserInfo user);
}
