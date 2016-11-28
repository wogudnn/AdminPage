package com.ktdsuniv.common.mongo.dao;

import com.ktdsuniv.common.mongo.schema.LogSchema;

public interface LogDao {

	public void writeLog(LogSchema loggerVO);
}
