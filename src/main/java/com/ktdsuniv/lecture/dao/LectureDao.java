package com.ktdsuniv.lecture.dao;

import java.util.List;

import com.ktdsuniv.lecture.schema.SearchLectureSchema;

import lecture.schema.LecturesSchema;

public interface LectureDao {

	public List<LecturesSchema> getAllLectureList(SearchLectureSchema searchLectureSchema);

	public int getTotalCount(SearchLectureSchema searchLectureSchema);
}
