package example.Spring.security.dao.impl;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import example.Spring.security.dao.UserDAO;
import example.Spring.security.model.User;

@Component("userDAO")
public class UserDAOImpl implements UserDAO {

	private static Logger logger = Logger.getLogger(UserDAOImpl.class.getName());
	
	private static final String INSERT_NEW_USER = "insert into users (username, password, email, enabled) values  (:username, :password, :email, :enabled)";

	private static final String INSERT_INTO_AUTHORITY = "insert into authorities(username, authority) values(:username, :authority)";
	
	private static final String CHECK_IF_USER_EXISTS="select count(*) from users where username=:username";
	@Resource(name = "dataSource")
	private DataSource dataSource;

	private NamedParameterJdbcTemplate jdbcTemplate;

	public DataSource jdbcTemplategetDataSource() {
		return dataSource;
	}
	
	@PostConstruct
	public void init() {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	@Transactional
	public boolean create(User user) {
		BeanPropertySqlParameterSource parameters = new BeanPropertySqlParameterSource(user);
		int rows = jdbcTemplate.update(INSERT_NEW_USER, parameters);
		if(rows == 1) { 
			logger.info("User created" );
			return jdbcTemplate.update(INSERT_INTO_AUTHORITY, parameters) == 1;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean exists(User user) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("usrename", user.getUsername());
		return jdbcTemplate.queryForObject(CHECK_IF_USER_EXISTS, params, Integer.class) == 1;
	}


}
