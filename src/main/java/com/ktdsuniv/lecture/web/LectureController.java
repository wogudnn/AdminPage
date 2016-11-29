package com.ktdsuniv.lecture.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniv.lecture.service.LectureService;

@Controller
public class LectureController {

	private LectureService lectureService;
	
	public void setLectureService(LectureService lectureService) {
		this.lectureService = lectureService;
	}
	
	@RequestMapping("/registLecture")
	public ModelAndView registLecturePage() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("lecture/registLecture");
		
		return view;
	}
}
