package example.Spring.security.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import example.Spring.security.dao.UserDAO;
import example.Spring.security.manager.UserManager;
import example.Spring.security.model.User;

@Component("userManager")
public class UserManagerImpl implements UserManager {

	@Autowired
	@Qualifier("userDAO")
	private UserDAO userDao;

	@Override
	public boolean create(User user) {
		return userDao.create(user);
	}

	@Override
	public boolean exists(User user) {
		return userDao.exists(user);
	}
}
