package com.ktdsuniv.board.service.impl;

import com.ktdsuniv.board.biz.ReplyBiz;
import com.ktdsuniv.board.service.ReplyService;

public class ReplyServiceImpl implements ReplyService {

	private ReplyBiz replyBiz;
	
	public void setReplyBiz(ReplyBiz replyBiz) {
		this.replyBiz = replyBiz;
	}
	
}
