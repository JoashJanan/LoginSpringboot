package com.login.registration.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.registration.springboot.service.UserService;
import com.login.registration.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/")
public class UserRegistrationController {

	private UserService userService;

	
	  public UserRegistrationController(UserService userService) 
	  { 
		  super();
	      this.userService = userService; 
	  }
	 

	@GetMapping("/demo")
	public String demoreg() {
		return "demo";
	}

	
	  @ModelAttribute("user")
	  public UserRegistrationDto userRegistrationDto() 
	  {
	  return new UserRegistrationDto(); 
	  }
	 

	@GetMapping("/registration")
	public String reg() {
		return "registration";
	}

	@PostMapping("/registration")
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) 
	{
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	 

}
