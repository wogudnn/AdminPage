package com.ktdsuniv.lecture.schema;

import java.util.List;

import com.ktdsuniv.common.util.pager.Pager;

import lecture.schema.LecturesSchema;

public class LectureListSchema {

	private List<LecturesSchema> lectureList;
	private Pager pager;
	public List<LecturesSchema> getLectureList() {
		return lectureList;
	}
	public void setLectureList(List<LecturesSchema> lectureList) {
		this.lectureList = lectureList;
	}
	public Pager getPager() {
		return pager;
	}
	public void setPager(Pager pager) {
		this.pager = pager;
	}
	
	
	
}
