package com.wangyuelin.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.wangyuelin.model.User;

@MapperScan
public interface UserMapper {

	void save(User user);
	boolean update(User user);
	boolean delete(int id);
	User findById(int id);
	List<User> findAll();
}
