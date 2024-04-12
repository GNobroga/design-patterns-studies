package br.com.gabiroba.bridge.mvc.dao;

import br.com.gabiroba.bridge.mvc.model.User;

public class UserMongoDao{

	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}
}
