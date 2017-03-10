package example.Spring.security.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {

	@NotNull
	@Size(min=3, max=50)
	@Pattern(regexp="^\\w{8,}$", message="Username can only contain numbers, letters and digits. No special characters")
	@NotBlank(message="Username cannot be blank")
	private String username;
	
	@NotBlank(message="password cannot be blank")
	@Pattern(regexp="^\\S+$")
	@NotNull
	@Size(min=3, max=50, message="Password must be greater than 3 and less than 50 characters")
	private String password;
	private boolean enabled = false;
	private String authority;
	
	@Email(message="Please provide the valid email address")
	@NotNull
	private String email;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, boolean enabled, String authority, String email) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.authority = authority;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
