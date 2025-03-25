package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.User;
import com.test.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	public void setRepository(UserRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping("/byemail/{email}")
	public User finduserByEmail(@PathVariable("email")String email)
	{
		return repository.getUserByEmail(email);
	}
	
	@PostMapping("/createuser")
	public User createUser(@RequestBody User user)
	{
		return repository.save(user);
	}

	
	@GetMapping("byfname/{fname}")
	public List<User> findUserByFirstName(@PathVariable("fname") String fname)
	{
		return repository.getUserByEndsWith(fname);
		
	}
	
}
