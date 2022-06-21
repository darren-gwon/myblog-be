package com.darren.myblog.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.darren.myblog.dto.CategoryDto;
import com.darren.myblog.dto.PostingDto;
import com.darren.myblog.service.CategoryService;
import com.darren.myblog.service.PostingService;

@RestController
@CrossOrigin
@RequestMapping("/posting")
public class PostingController {
	
	@Autowired
	PostingService postingService;
	@Autowired
	CategoryService categoryService;
	
//	@GetMapping("/recent")
//	public List<PostingDto> recentPosting(){
//		
//	}
	
	@PostMapping("/write")
	public void writePosting(@RequestBody PostingDto posting, HttpSession session) {
		String user_id = (String)session.getAttribute("user_id");
		
		posting.setUser_id(user_id);
		postingService.insertPosting(posting);
		System.out.println(posting.getPost_no());
	}
	
	@GetMapping("/write")
	public List<CategoryDto> writeForm(HttpSession session) {
		session.setAttribute("user_id", "darren_gwon");
		
		String blog_id = (String)session.getAttribute("user_id");
		System.out.println(blog_id);
		System.out.println(categoryService.selectCategory(blog_id));
		return categoryService.selectCategory(blog_id);
	}
}
