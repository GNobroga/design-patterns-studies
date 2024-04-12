package br.com.gabiroba.bridge.backend.services;

import br.com.gabiroba.bridge.backend.dao.UserDao;
import br.com.gabiroba.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
