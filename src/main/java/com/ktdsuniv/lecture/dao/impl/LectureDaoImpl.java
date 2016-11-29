package com.ktdsuniv.lecture.dao.impl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.ktdsuniv.common.support.mongo.MongoTemplateSupport;
import com.ktdsuniv.lecture.dao.LectureDao;
import com.ktdsuniv.lecture.schema.SearchLectureSchema;

import lecture.schema.LecturesSchema;

public class LectureDaoImpl extends MongoTemplateSupport implements LectureDao {

	@Override
	public List<LecturesSchema> getAllLectureList(SearchLectureSchema searchLectureSchema) {

		Criteria criteria = new Criteria();
		
		if(searchLectureSchema.getSearchType()==1){
			criteria = new Criteria("lectureName");
			criteria.regex(searchLectureSchema.getSearchKeyword());
		} 
		else if(searchLectureSchema.getSearchType()==2){
			criteria = new Criteria("instructor.user.userName");
			criteria.regex(searchLectureSchema.getSearchKeyword());
		}
		Query query = new Query(criteria);
		query.with(new Sort(Sort.Direction.DESC,"_id"));
		query.skip(searchLectureSchema.getStartNumber());
		query.limit(searchLectureSchema.getEndNumber());
		
		
		
		return getMongo().find(query, LecturesSchema.class);
	}
	
	@Override
	public int getTotalCount(SearchLectureSchema searchLectureSchema) {

		Criteria criteria = new Criteria();
		
		if(searchLectureSchema.getSearchType()==1){
			criteria = new Criteria("lectureName");
			criteria.regex(searchLectureSchema.getSearchKeyword());
		} 
		else if(searchLectureSchema.getSearchType()==2){
			criteria = new Criteria("instructor.user.userName");
			criteria.regex(searchLectureSchema.getSearchKeyword());
		}
		Query query = new Query(criteria);
		
		return (int) getMongo().count(query, "lectures");
	}
	
}
