package com.user.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	 List<User> list= List.of(new User(1311L,"Shubham garg","987979"),
			new User(1312L," garg", "987979"),
			new User( 1313L, "Shubham","987979"));
	
	
	@Override
	public User getUser(Long id)
	{
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
