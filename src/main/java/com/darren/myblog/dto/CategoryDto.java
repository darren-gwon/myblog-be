package com.darren.myblog.dto;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("CategoryDto")
@Data
public class CategoryDto {
	private Integer category_no;
	private Integer p_category_no;
	private String blog_id;
	private String category_name;
	private Integer order;
}
