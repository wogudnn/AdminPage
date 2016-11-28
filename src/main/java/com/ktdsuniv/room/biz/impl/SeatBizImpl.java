package com.ktdsuniv.room.biz.impl;

import com.ktdsuniv.room.biz.SeatBiz;
import com.ktdsuniv.room.dao.SeatDao;

public class SeatBizImpl implements SeatBiz {

	private SeatDao seatDao;
	
	public void setSeatDao(SeatDao seatDao) {
		this.seatDao = seatDao;
	}
	
}
