package com.darren.myblog.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("PostingDto")
public class PostingDto {
	private Integer post_no;
	private Integer category_no;
	private String user_id;
	private String title;
	private String content;
	private String thumbnail_img;
	private Timestamp reg_date;
	private Timestamp modify_date;
}
