package creational.factory_method.mysql;

import creational.factory_method.Dao;

public class MySqlDao implements Dao {
	@Override
	public String getConnection() {
		return "MySql connection";
	}
}
