package com.car.rental.service;

import java.util.List;

import com.car.rental.domain.UserLogin;

public interface UserService {
	public void saveUser(UserLogin user);

	public void deleteUser(int id);

	public List<UserLogin> listAllUsers();

	public UserLogin getUserById(int id);

	public UserLogin getUserByUsername(String username);

	public UserLogin getUserByVerification(String code);

	public void changePassword(UserLogin user);
}
