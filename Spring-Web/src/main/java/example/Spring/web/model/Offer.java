package example.Spring.web.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import example.Spring.web.validation.constraints.ValidEmail;

public class Offer {

	private int id;

	@NotNull
	@Size(min=3, max=100, message="Name must be greater than 3 and less than 100 characters")
	private String name;

	@NotNull
	@ValidEmail(min=6)
	private String email;

	@Size(min=5, max = 30, message= "text must be between 5 and 30 characters")
	private String text;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return String.format("Offer [id=%s, name=%s, email=%s, text=%s]", id, name, email, text);
	}

	public Offer(String name, String email, String text) {
		super();
		this.name = name;
		this.email = email;
		this.text = text;
	}

	public Offer() {
		super();
	}

	public Offer(int id, String name, String email, String text) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}

}
