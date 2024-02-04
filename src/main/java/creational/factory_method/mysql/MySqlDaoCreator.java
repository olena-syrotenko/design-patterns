package creational.factory_method.mysql;

import creational.factory_method.Dao;
import creational.factory_method.DaoCreator;

public class MySqlDaoCreator implements DaoCreator {
	@Override
	public Dao getDao() {
		return new MySqlDao();
	}
}
