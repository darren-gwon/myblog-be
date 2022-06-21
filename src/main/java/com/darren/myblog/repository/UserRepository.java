package com.darren.myblog.repository;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.darren.myblog.dto.UserDto;

@Mapper
@Repository
public interface UserRepository {
	public Integer insertUser(UserDto userDto);
	public UserDto selectUser(String user_id);
}
