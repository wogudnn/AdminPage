package com.ktdsuniv.lecture.service;

import com.ktdsuniv.lecture.schema.LectureListSchema;
import com.ktdsuniv.lecture.schema.SearchLectureSchema;

public interface LectureService {

	public LectureListSchema getAllLectureList(SearchLectureSchema searchLectureSchema);

	
}
