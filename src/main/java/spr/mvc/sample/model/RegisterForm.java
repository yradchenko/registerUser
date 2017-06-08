package spr.mvc.sample.model;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class RegisterForm {
	private Long id;

	@NotNull
	@Size(min = 6, max = 16, message = "Username must be between 6 and 16 characters")
	private String username;

	@NotNull
	@Size(min = 5, max = 25)
	private String password;

	@NotNull
	@Size(min = 2, max = 30, message = "First name must be between 2 and 30 characters")
	private String firstName;

	@NotNull
	@Size(min = 2, max = 30, message = "Last Name must be between 2 and 15 characters")
	private String lastName;

	@NotNull
	@NotEmpty
	@Email
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "RegisterForm [id=" + id + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

	// public User toUser() {
	// return new User(username, password, firstName, lastName, email);
	// }

}
