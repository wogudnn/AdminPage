package com.ktdsuniv.user.service.impl;

import com.ktdsuniv.user.biz.UserBiz;
import com.ktdsuniv.user.service.UserService;

public class UserServiceImpl implements UserService {

	private UserBiz userBiz;
	
	public void setUserBiz(UserBiz userBiz) {
		this.userBiz = userBiz;
	}
}
