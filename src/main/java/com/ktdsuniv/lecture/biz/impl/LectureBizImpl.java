package com.ktdsuniv.lecture.biz.impl;

import com.ktdsuniv.lecture.biz.LectureBiz;
import com.ktdsuniv.lecture.dao.LectureDao;

public class LectureBizImpl implements LectureBiz {

	private LectureDao lectureDao;
	
	public void setLectureDao(LectureDao lectureDao) {
		this.lectureDao = lectureDao;
	}
	
}
