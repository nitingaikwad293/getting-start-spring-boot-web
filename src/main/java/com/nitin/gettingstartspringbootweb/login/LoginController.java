package com.nitin.gettingstartspringbootweb.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private LoginAuthenticationService authenticationService;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		logger.debug("Inside /login Get method ");
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String logincheck(@RequestParam String name, @RequestParam String password, ModelMap model) {

		if (authenticationService.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		} else {
			model.put("error" ,"Invalid Credentails ! Please login again ");
			return "login";
		}
	}
}
