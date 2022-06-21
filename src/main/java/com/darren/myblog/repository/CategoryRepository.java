package com.darren.myblog.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.darren.myblog.dto.CategoryDto;

@Mapper
@Repository
public interface CategoryRepository {
	public List<CategoryDto> selectCategory(String user_id);
}
