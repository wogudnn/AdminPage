package com.ktdsuniv.board.service.impl;

import com.ktdsuniv.board.biz.BoardBiz;
import com.ktdsuniv.board.service.BoardService;

public class BoardServiceImpl implements BoardService {

	private BoardBiz boardBiz;
	
	public void setBoardBiz(BoardBiz boardBiz) {
		this.boardBiz = boardBiz;
	}
	
}
