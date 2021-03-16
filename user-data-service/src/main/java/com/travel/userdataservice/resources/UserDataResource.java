package com.travel.userdataservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.userdataservice.model.User;

@RestController
@RequestMapping("/users")
public class UserDataResource {
	
	@RequestMapping("/{userId}")
	public User getUserDetails(@PathVariable("userId") String userId) {
		return new User(userId, "abc@gmail.com");
	}

}
