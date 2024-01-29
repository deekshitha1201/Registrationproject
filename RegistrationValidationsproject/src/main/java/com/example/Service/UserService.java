package com.example.Service;

import java.util.List;

import com.example.Dto.UserRequest;
import com.example.Entity.User;

public interface UserService {
	String registeUser(UserRequest userrequest);
	List<User> getall();

}
