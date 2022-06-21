package com.darren.myblog.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("UserDto")
public class UserDto {
	private Integer seq;
	private String user_id;
	private String user_pwd;
	private String user_nickname;
	private Timestamp reg_date; 
}
