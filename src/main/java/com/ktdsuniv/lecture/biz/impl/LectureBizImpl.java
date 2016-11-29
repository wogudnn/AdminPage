package com.ktdsuniv.lecture.biz.impl;

import java.util.List;

import com.ktdsuniv.common.util.pager.Pager;
import com.ktdsuniv.common.util.pager.PagerFactory;
import com.ktdsuniv.lecture.biz.LectureBiz;
import com.ktdsuniv.lecture.dao.LectureDao;
import com.ktdsuniv.lecture.schema.LectureListSchema;
import com.ktdsuniv.lecture.schema.SearchLectureSchema;

import lecture.schema.LecturesSchema;

public class LectureBizImpl implements LectureBiz {

	private LectureDao lectureDao;
	
	public void setLectureDao(LectureDao lectureDao) {
		this.lectureDao = lectureDao;
	}
	
	@Override
	public LectureListSchema getAllLectureList(SearchLectureSchema searchLectureSchema) {
		
		int totalCount = lectureDao.getTotalCount(searchLectureSchema);
		
		Pager pager = PagerFactory.getPager(Pager.OTHER);
		pager.setPageNumber(searchLectureSchema.getPageNo());
		pager.setTotalArticleCount(totalCount);
		pager.setStartArticleNumber(searchLectureSchema.getStartNumber());
		pager.setEndArticleNumber(searchLectureSchema.getEndNumber());
		List<LecturesSchema> Lectures = lectureDao.getAllLectureList(searchLectureSchema);
		LectureListSchema listLecture = new LectureListSchema();
		listLecture.setLectureList(Lectures);
		listLecture.setPager(pager);
		
		
		return listLecture;
	}
	
}
