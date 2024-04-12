package br.com.gabiroba.factory.app.dbadapter.after.factory;

import br.com.gabiroba.factory.app.dbadapter.after.db.DB;
import br.com.gabiroba.factory.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
