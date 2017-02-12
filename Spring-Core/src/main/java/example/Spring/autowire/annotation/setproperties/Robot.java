package example.Spring.autowire.annotation.setproperties;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value="robo")
public class Robot implements Serializable {

	private static Logger logger = Logger.getLogger(Robot.class.getName());
	private static final long serialVersionUID = 1L;

	@Resource
	@Value("1001")
	private int id;
	
	@Autowired
	@Value("Hi, I am chitti 1.0.. Hello World...")
	private String speech;
	
	public void speak() {
		logger.info("id : " + id + " speech : " + speech + " can speak");
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Robot [id=");
		builder.append(id);
		builder.append(", speech=");
		builder.append(speech);
		builder.append("]");
		return builder.toString();
	}

}
