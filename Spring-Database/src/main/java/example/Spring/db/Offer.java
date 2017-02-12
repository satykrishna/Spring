package example.Spring.db;

public class Offer {

	private int id;

	private String name;

	private String email;

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

	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}

}
