package example.Spring.db;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value = "database")
public class Database {

	private static Logger logger = Logger.getLogger(Database.class.getName());
	
	@Resource
	@Value("${jdbc.url}")
	private String connectionURL;

	@Resource
	@Value("${jdbc.user}")
	private String userName;

	@Resource
	@Value("${jdbc.password}")
	private String password;

	@Resource
	@Value("${jdbc.driver}")
	private String driver;

	@Override
	public String toString() {
		return String.format("Database [connectionURL=%s, userName=%s, password=%s, driver=%s]", connectionURL,
				userName, password, driver);
	}
	
	@PostConstruct
	public void init() {
		logger.info(this.toString());
	}
	
	
}
