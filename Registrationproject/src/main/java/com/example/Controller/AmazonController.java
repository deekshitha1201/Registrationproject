package com.example.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.AmazonRegister;
import com.example.Service.AmazonService;

@RestController
public class AmazonController {
	@Autowired
	private AmazonService aser;
	@PostMapping("/register")
	public ResponseEntity<AmazonRegister> registeruser(@RequestBody AmazonRegister amazonregister)
	{
		try
		{
			return new ResponseEntity<AmazonRegister>(aser.registeruser(amazonregister),HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<AmazonRegister>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("{id}")
	public ResponseEntity<String> regisration(@PathVariable Long id)
	{
		return new ResponseEntity<String>(aser.registration(id),HttpStatus.OK);
	}
	@GetMapping("get/{id}")
	public ResponseEntity<String> loginpage(@PathVariable Long id,@RequestBody Map<String,String> request)
	{
		String username=request.get("username");
		String password=request.get("password");
		try
		{
			return new ResponseEntity<String>(aser.login(id, username, password),HttpStatus.OK);
		}catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
	}

}
