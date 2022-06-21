package com.darren.myblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darren.myblog.dto.PostingDto;
import com.darren.myblog.repository.PostingRepository;

@Service
public class PostingServiceImpl implements PostingService {

	@Autowired
	PostingRepository postingRepository;
	
	@Override
	public Integer insertPosting(PostingDto postingDTo) {
		return postingRepository.insertPosting(postingDTo);
	}
	
}
