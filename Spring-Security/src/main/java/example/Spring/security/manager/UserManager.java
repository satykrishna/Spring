package example.Spring.security.manager;

import example.Spring.security.model.User;

public interface UserManager {

	public abstract boolean create(User user);

	public abstract boolean exists(User user);
}
