package com.ktdsuniv.project.service.impl;

import com.ktdsuniv.project.biz.ProjectBiz;
import com.ktdsuniv.project.service.ProjectService;

public class ProjectServiceImpl implements ProjectService{

	private ProjectBiz projectBiz;
	
	public void setProjectBiz(ProjectBiz projectBiz) {
		this.projectBiz = projectBiz;
	}
	
}
