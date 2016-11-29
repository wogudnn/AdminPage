package com.ktdsuniv.room.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktdsuniv.room.service.RoomService;

@Controller
public class RoomController {

	
	private RoomService roomService;

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@RequestMapping("/addRoom")
	public ModelAndView viewAddRoomPage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("room/addRoom");
		return view;
	}
	
	@RequestMapping()
	public ModelAndView doAddRoomAction() {
		ModelAndView view = new ModelAndView();
		
		return "redirect:/room";
		
	}

	
}
