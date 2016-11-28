package com.ktdsuniv.room.service.impl;

import com.ktdsuniv.room.biz.RoomBiz;
import com.ktdsuniv.room.service.RoomService;

public class RoomServiceImpl implements RoomService {

	private RoomBiz roomBiz;

	public void setRoomBiz(RoomBiz roomBiz) {
		this.roomBiz = roomBiz;
	}
	
	
}
