package com.darren.myblog.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darren.myblog.dto.PostingDto;
import com.darren.myblog.repository.PostingRepository;

@RestController
@CrossOrigin
@RequestMapping("/posting")
public class PostingController {
	
	@Autowired
	PostingRepository postingRepository;
	
//	@GetMapping("/recent")
//	public List<PostingDto> recentPosting(){
//		
//	}
	
	@PostMapping("/write")
	public void writePosting(@RequestBody PostingDto posting, HttpSession session) {
		session.setAttribute("user_id", "darren_gwon");
		
		String user_id = (String)session.getAttribute("user_id");
		posting.setUser_id(user_id);
		postingRepository.insertPosting(posting);
		System.out.println(posting.getPost_no());
	}
}
