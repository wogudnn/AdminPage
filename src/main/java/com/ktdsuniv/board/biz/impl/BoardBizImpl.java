package com.ktdsuniv.board.biz.impl;

import com.ktdsuniv.board.biz.BoardBiz;
import com.ktdsuniv.board.dao.BoardDao;

public class BoardBizImpl implements BoardBiz {

	private BoardDao boardDao;
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
}
