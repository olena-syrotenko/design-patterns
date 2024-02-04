package creational.factory_method.mongodb;

import creational.factory_method.Dao;

public class MongoDbDao implements Dao {
	@Override
	public String getConnection() {
		return "MongoDb connection";
	}
}
