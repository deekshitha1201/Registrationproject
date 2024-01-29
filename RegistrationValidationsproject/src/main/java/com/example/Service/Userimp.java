package com.example.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dto.UserRequest;
import com.example.Entity.User;
import com.example.Repository.UserRepository;
@Service
public class Userimp implements UserService {
	@Autowired
	private UserRepository userrepo;

	public String registeUser(UserRequest userrequest) {
		User user=new User();
		user.setName(userrequest.getName());
		user.setEmail(userrequest.getEmail());
		user.setMobilenumber(userrequest.getMobilenumber());
		user.setPassword(userrequest.getPassword());
		List<User> c=getall().stream().filter(res->(res.getEmail().equalsIgnoreCase(userrequest.getEmail()))).collect(Collectors.toList()
				);
		if(c.isEmpty())
			{
			userrepo.save(user);
			return "successfully saved";
			}
		else
			{
			return "email is already exists";
    		}
	}

	@Override
	public List<User> getall() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}
	

}
