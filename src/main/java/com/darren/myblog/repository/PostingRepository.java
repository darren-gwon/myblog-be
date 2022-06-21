package com.darren.myblog.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.darren.myblog.dto.PostingDto;

@Mapper
@Repository
public interface PostingRepository {
	public Integer insertPosting(PostingDto postingDTo);
}
