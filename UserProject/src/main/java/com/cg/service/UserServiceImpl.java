package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Users;
import com.cg.userdao.UserDao;

@Service
public class UserServiceImpl implements UserDao {
	List<Users> userList = new ArrayList<>();

	public UserServiceImpl() {

		userList.add(new Users(1, "A"));
		userList.add(new Users(2, "B"));
		userList.add(new Users(3, "C"));
		userList.add(new Users(4, "D"));

	}

	public List<Users> getAllUsers() {

		return userList;

	}
}
