package com.darren.myblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darren.myblog.dto.CategoryDto;
import com.darren.myblog.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<CategoryDto> selectCategory(String blog_id) {
		return categoryRepository.selectCategory(blog_id);
	}
}
