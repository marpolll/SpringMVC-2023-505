package com.marpol.bbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marpol.bbs.models.UserDto;

public interface UserRepository extends JpaRepository<UserDto, Long> {
	
	

}
