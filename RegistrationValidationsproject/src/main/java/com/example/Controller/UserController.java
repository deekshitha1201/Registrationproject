package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dto.UserRequest;
import com.example.Entity.User;
import com.example.Service.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	private UserService userepo;
	@PostMapping("/record")
	public ResponseEntity<String> registered(@RequestBody @Valid UserRequest user)
	{
		return new ResponseEntity<String>(userepo.registeUser(user),HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<User>> getallrecords()
	{
		return new ResponseEntity<List<User>>(userepo.getall(),HttpStatus.OK);
	}
}
