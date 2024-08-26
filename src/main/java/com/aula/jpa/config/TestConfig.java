package com.aula.jpa.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aula.jpa.entities.Order;
import com.aula.jpa.entities.User;
import com.aula.jpa.repositories.OrderRepository;
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
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Artur Cadorin", "artur@gmail.com", "48 9999-9999", "123");
		User u2 = new User(null, "Lívia Cadorin", "livia@gmail.com", "48 55555-5555","321");
		
		Order o1 = new Order(null, Instant.parse("2024-11-24T19:30:14Z"), u1);
		Order o2 = new Order(null, Instant.parse("2020-10-17T10:48:31Z"), u2);
		
		userRepository.saveAll(Arrays.asList(u1,u2));	
		orderRepository.saveAll(Arrays.asList(o1,o2));
		
	}	
}
