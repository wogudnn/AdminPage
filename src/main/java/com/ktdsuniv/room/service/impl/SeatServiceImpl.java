package com.ktdsuniv.room.service.impl;

import com.ktdsuniv.room.biz.SeatBiz;
import com.ktdsuniv.room.service.SeatService;

public class SeatServiceImpl implements SeatService {

	private SeatBiz seatBiz;
	
	public void setSeatBiz(SeatBiz seatBiz) {
		this.seatBiz = seatBiz;
	}
	
}
