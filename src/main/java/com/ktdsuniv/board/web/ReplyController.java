package com.ktdsuniv.board.web;

import org.springframework.stereotype.Controller;

import com.ktdsuniv.board.service.ReplyService;

@Controller
public class ReplyController {

	private ReplyService replyService;
	
	public void setReplyService(ReplyService replyService) {
		this.replyService = replyService;
	}
	
}
