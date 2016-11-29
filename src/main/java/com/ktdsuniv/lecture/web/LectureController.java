package com.ktdsuniv.lecture.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniv.common.util.pager.ClassicPageExplorer;
import com.ktdsuniv.common.util.pager.PageExplorer;
import com.ktdsuniv.lecture.schema.LectureListSchema;
import com.ktdsuniv.lecture.schema.SearchLectureSchema;
import com.ktdsuniv.lecture.service.LectureService;

@Controller
public class LectureController {

	private LectureService lectureService;
	
	public void setLectureService(LectureService lectureService) {
		this.lectureService = lectureService;
	}
	
	@RequestMapping("/lecture/list")
	public ModelAndView viewListPage(SearchLectureSchema searchLectureSchema){
		ModelAndView view = new ModelAndView();
		LectureListSchema lectures = lectureService.getAllLectureList(searchLectureSchema);
		
		PageExplorer pageExplorer = new ClassicPageExplorer(lectures.getPager());
		String pager = pageExplorer.getPagingList("pageNo", "[@]", "<<", ">>", "searchForm");
		view.addObject("lectures", lectures);
		view.addObject("paging", pager);
		view.setViewName("lecture/list");
		return view;
	}
	
	@RequestMapping("/lecture/registLecture")
	public ModelAndView registLecturePage() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("lecture/registLecture");
		
		return view;
	}
}
