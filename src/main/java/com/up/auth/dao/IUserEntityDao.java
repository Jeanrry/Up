package com.up.auth.dao;

import com.up.model.UserEntity;

public interface IUserEntityDao {
	UserEntity get(int id);
	UserEntity getRef(int id);
	UserEntity getRef(String username);
	void update(UserEntity user);
	void save(UserEntity user);
	UserEntity findByUserName(String username);
	UserEntity findByNickname(String nickname);
	UserEntity findByPhone(String phone);
	UserEntity findByEmail(String email);
	boolean hasAvatar(String username);
}
