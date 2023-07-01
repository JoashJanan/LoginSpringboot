package com.login.registration.springboot.service;

import com.login.registration.springboot.model.User;
import com.login.registration.springboot.web.dto.UserRegistrationDto;



public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
