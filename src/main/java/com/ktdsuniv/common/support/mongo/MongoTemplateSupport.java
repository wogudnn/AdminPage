package com.ktdsuniv.common.support.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @author mcjan
 *
 */
public class MongoTemplateSupport {

	private MongoTemplate mongoTemplate;
	
	public MongoTemplate getMongo() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	
}
