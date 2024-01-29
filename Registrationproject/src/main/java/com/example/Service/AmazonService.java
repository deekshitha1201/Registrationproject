package com.example.Service;

import org.springframework.stereotype.Service;

import com.example.Entity.AmazonRegister;

@Service
public interface AmazonService {
	AmazonRegister registeruser(AmazonRegister amazonregister);
	public String registration(Long id);
	
	String login(Long id,String username, String password);

}
