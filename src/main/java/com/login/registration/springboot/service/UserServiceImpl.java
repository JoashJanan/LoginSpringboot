package com.login.registration.springboot.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.login.registration.springboot.model.Role;
import com.login.registration.springboot.model.User;
import com.login.registration.springboot.web.dto.UserRegistrationDto;

import com.login.registration.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}



	//new User(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), Arrays.asList(new Role("ROLE_USER")));
		@Override
		public User save(UserRegistrationDto registrationDto)
		{
			User user = new User(registrationDto.getFirstName(), registrationDto.getLastName(),
					registrationDto.getEmail(), registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
			
			return userRepository.save(user);
		}
}
