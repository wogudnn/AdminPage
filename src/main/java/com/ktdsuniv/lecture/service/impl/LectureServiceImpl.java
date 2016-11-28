package com.ktdsuniv.lecture.service.impl;

import com.ktdsuniv.lecture.biz.LectureBiz;
import com.ktdsuniv.lecture.service.LectureService;

public class LectureServiceImpl implements LectureService {

	private LectureBiz lectureBiz;
	
	public void setLectureBiz(LectureBiz lectureBiz) {
		this.lectureBiz = lectureBiz;
	}
	
}
