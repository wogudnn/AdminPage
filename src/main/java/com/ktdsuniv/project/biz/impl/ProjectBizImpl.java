package com.ktdsuniv.project.biz.impl;

import com.ktdsuniv.project.biz.ProjectBiz;
import com.ktdsuniv.project.dao.ProjectDao;

public class ProjectBizImpl implements ProjectBiz {

	private ProjectDao projectDao;
	
	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}
	
}
