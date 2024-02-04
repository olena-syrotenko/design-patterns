package creational.factory_method.mongodb;

import creational.factory_method.Dao;
import creational.factory_method.DaoCreator;

public class MongoDbDaoCreator implements DaoCreator {
	@Override
	public Dao getDao() {
		return new MongoDbDao();
	}
}
