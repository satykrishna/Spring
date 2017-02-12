package example.Spring.autowire.spel.annotations;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value="robo")
public class Robot implements Serializable {

	private static Logger logger = Logger.getLogger(Robot.class.getName());

	private static final long serialVersionUID = 1L;

	
	@Resource
//	@Value("#{randomText.text}")
//	@Value("#{new java.util.Date().toString()}")
//	@Value("#{T(Math).PI}") -- static property access of Math class
	@Value("#{T(Math).sin(T(Math).PI/4)^2 lt 0.1} ")
	private String speech;

	@Resource
	@Value("#{robo.speech==null?0:robo.speech.length()}")
	private int id;

	public void speak() {
		logger.info("id : " + id + " speech : " + speech + " can speak");
	}

	@Override
	public String toString() {
		return String.format("Robot [id=%s, speech=%s]", id, speech);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}
	

}
