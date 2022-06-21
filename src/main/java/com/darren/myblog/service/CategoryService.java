package com.darren.myblog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.darren.myblog.dto.CategoryDto;

@Service
public interface CategoryService {
	public List<CategoryDto> selectCategory(String blog_id);
}
