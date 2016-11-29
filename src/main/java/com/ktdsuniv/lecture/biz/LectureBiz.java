package com.ktdsuniv.lecture.biz;

import com.ktdsuniv.lecture.schema.LectureListSchema;
import com.ktdsuniv.lecture.schema.SearchLectureSchema;

public interface LectureBiz {

	public LectureListSchema getAllLectureList(SearchLectureSchema searchLectureSchema);

	
}
