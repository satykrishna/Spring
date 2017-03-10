package example.Spring.security.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import example.Spring.security.manager.UserManager;
import example.Spring.security.model.User;

@Controller
public class LoginController {

	@Autowired
	@Qualifier("userManager")
	private UserManager userManager;

	@RequestMapping("/login")
	public String showLogin() {
		return "login";
	}

	@RequestMapping("/newaccount")
	public String showNewAccountForm(Model model) {
		model.addAttribute("user", new User());
		return "newaccount";
	}

	@RequestMapping("/createaccount")
	public String createAccount(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return "newaccount";
		}
		user.setEnabled(true);
		user.setAuthority("user");
		boolean created = userManager.exists(user);

		try {
			created = userManager.create(user);
		} catch (DataAccessException e) {
			e.printStackTrace();
			result.rejectValue("username", "DuplicateKey.user.username");
			return "newaccount";
		}

		if (created) {
			System.out.println("User already created");
		}
		return "accountcreated";
	}
	
	@RequestMapping("/logout")
	public String showLoggedOut() {
		return "logout";
	}

}
