package com.ktdsuniv.project.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.project.service.ProjectService;

@Controller
public class ProjectController {

	private ProjectService projectService;
	
	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	
}
