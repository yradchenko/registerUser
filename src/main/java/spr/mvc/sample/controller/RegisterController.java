package spr.mvc.sample.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import spr.mvc.sample.domain.User;
import spr.mvc.sample.model.RegisterForm;
import spr.mvc.sample.service.RegisterService;

@Controller
public class RegisterController {

	private static final Logger logger = LoggerFactory.getLogger(RegisterController.class);
	private RegisterService registerService;

	@Autowired
	public RegisterController(RegisterService registerService) {
		this.registerService = registerService;
	}

	@RequestMapping(value = "/register", method = GET)
	public String showRegistrationForm(Model model) {
		logger.info("show Registration form  ... ");
		model.addAttribute(new RegisterForm());
		return "register";
	}

	@RequestMapping(value = "/register", method = POST)
	public String processRegistration(@Valid RegisterForm registerForm, Errors errors, BindingResult result,
			Model model) {
		logger.info("process Registration form ... ");

		if (errors.hasErrors()) {
			return "register";
		} else {

			User user = new User();
			user.setId(registerForm.getId());
			user.setFirstName(registerForm.getFirstName());
			user.setLastName(registerForm.getLastName());
			user.setUsername(registerForm.getUsername());
			user.setPassword(registerForm.getPassword());
			user.setEmail(registerForm.getEmail());

			registerService.saveRegister(user);
			return "redirect:/register/" + registerForm.getUsername();
		}
	}

	@RequestMapping(value = "/register/{username}", method = GET)
	public String showProfile(@PathVariable String username, Model model) {
		logger.info("display user Profile ... ");

		RegisterForm registerForm = registerService.findByUsername(username);
		model.addAttribute(registerForm);
		return "profile";
	}

}
