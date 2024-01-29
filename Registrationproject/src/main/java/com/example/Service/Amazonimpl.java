package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.AmazonRegister;
import com.example.Repository.AmazonRepository;

@Service
public class Amazonimpl implements AmazonService {
	@Autowired
	private AmazonRepository arepo;

	@Override
	public AmazonRegister registeruser(AmazonRegister amazonregister) {
		// TODO Auto-generated method stub
		return arepo.save(amazonregister);
	}

	@Override
	public String registration(Long id) {
		if(arepo.existsById(id))
		{
			arepo.findById(id);
			return "registration successfully";
		}else
		{
			return "not found";
		}
		
	}

	@Override
	public String login(Long id, String username, String password) {
		if(arepo.existsById(id))
		{
			AmazonRegister aa=arepo.findById(id).get();
			if(aa.getUsername().equals(username)&&aa.getPassword().equals(password))
			{
				return "login successfully";
			}
			else
			{
				return "invalid username or password";
			}
		}
		return "id not registered";
	}

	
}
