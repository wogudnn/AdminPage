package com.ktdsuniv.room.biz.impl;

import com.ktdsuniv.room.biz.RoomBiz;
import com.ktdsuniv.room.dao.RoomDao;

public class RoomBizImpl implements RoomBiz {

	private RoomDao roomDao;

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

}
