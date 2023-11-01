package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Users;

import com.cg.service.UserServiceImpl;

@RestController
public class UserController {
@Autowired
private UserServiceImpl userimpl;

@GetMapping("/user/{uid}")
public List<Users> getAllUsers(){
	return userimpl.getAllUsers();
}
	

}
