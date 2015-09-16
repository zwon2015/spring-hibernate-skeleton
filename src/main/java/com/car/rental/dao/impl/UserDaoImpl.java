package com.car.rental.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.car.rental.dao.UserDao;
import com.car.rental.domain.UserLogin;
import com.car.rental.util.SessionUtil;

@Repository
public class UserDaoImpl extends SessionUtil implements UserDao {

	@Override
	public void saveUser(UserLogin user) {
		getSession().saveOrUpdate(user);
	}

	@Override
	public void deleteUser(int id) {
		UserLogin user = getUserById(id);
		getSession().delete(user);
	}

	@Override
	public List<UserLogin> listAllUsers() {

		return getSession().createQuery("FROM UserLogin").list();
	}

	@Override
	public UserLogin getUserById(int id) {

		return (UserLogin) getSession().get(UserLogin.class, id);
	}

	@Override
	public UserLogin getUserByVerification(String code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserLogin getUserByUsername(String username) {
		return (UserLogin) getSession().createQuery("SELECT u FROM UserLogin u WHERE u.username=?").setParameter(0, username).uniqueResult();
	}
}
