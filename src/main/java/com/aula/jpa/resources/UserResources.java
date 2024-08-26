package com.aula.jpa.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aula.jpa.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "48 99999-9999", "1234");
		return ResponseEntity.ok().body(u);	
	}
}


