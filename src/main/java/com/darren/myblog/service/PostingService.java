package com.darren.myblog.service;

import org.springframework.stereotype.Service;

import com.darren.myblog.dto.PostingDto;

@Service
public interface PostingService {
	public Integer insertPosting(PostingDto postingDTo);
}