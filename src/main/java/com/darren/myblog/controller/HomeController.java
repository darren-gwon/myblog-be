package com.darren.myblog.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("")
	public void main(String user_id) {
		System.out.println(user_id);
	}	
}
