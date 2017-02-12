package example.Spring.autowire.spel;

import java.io.Serializable;
import java.util.logging.Logger;

public class Robot implements Serializable {

	private static Logger logger = Logger.getLogger(Robot.class.getName());

	private static final long serialVersionUID = 1L;

	private int id;

	private String speech;

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
