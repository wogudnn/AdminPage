package com.ktdsuniv.user.biz.impl;

import com.ktdsuniv.user.biz.UserBiz;
import com.ktdsuniv.user.dao.UserDao;

public class UserBizImpl implements UserBiz {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
