package com.aula.jpa.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aula.jpa.entities.User;
import com.aula.jpa.repositories.UserRepository;

/*
 * Arquivo de configuração do projeto.		
 * 
 * */
 
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired	
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User("Artur Cadorin", "artur@gmail.com", "48 9999-9999", "123");
		User u2 = new User("Lívia Cadorin", "livia@gmail.com", "48 55555-5555","321");
		
		userRepository.saveAll(Arrays.asList(u1,u2));	
		
	}	
}
