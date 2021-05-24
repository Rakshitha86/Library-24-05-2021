package com.xworkz.commonmodule.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.commonmodule.dto.RegisterDTO;
import com.xworkz.commonmodule.service.RegisterService;

@Controller
@RequestMapping("/")
public class RegisterController {

	private static Logger logger;
	@Autowired
	private RegisterService service;

	public RegisterController() {
		logger = Logger.getLogger(getClass());
	}

	@PostMapping("/register.cm")
	public ModelAndView register(RegisterDTO registerDTO) {
		logger.info("Invoked register()");
		ModelAndView modelAndView = new ModelAndView("Register");
		try {
			String msg = service.validateAndSave(registerDTO);
			modelAndView.addObject("message","Successfully Registered by " + registerDTO.getFullname());
		} catch (Exception e) {
			logger.error("You have an exception in " + e.getMessage(), e);
		}
		return modelAndView;

	}

}
