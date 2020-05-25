package com.bss.practice.user;

public interface UserDAO {
	
	public int login(String userId, String userPassword);
	
	public int join(User user);
}
