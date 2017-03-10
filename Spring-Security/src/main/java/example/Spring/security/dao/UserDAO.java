package example.Spring.security.dao;

import example.Spring.security.model.User;

public interface UserDAO {

	
	public abstract boolean create(User user);

	public abstract boolean exists(User user);
	
}
