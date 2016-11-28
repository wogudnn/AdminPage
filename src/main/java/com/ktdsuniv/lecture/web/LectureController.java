package com.ktdsuniv.lecture.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.lecture.service.LectureService;

@Controller
public class LectureController {

	private LectureService lectureService;
	
	public void setLectureService(LectureService lectureService) {
		this.lectureService = lectureService;
	}
	
}
