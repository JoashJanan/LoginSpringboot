package com.login.registration.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.login.registration.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
