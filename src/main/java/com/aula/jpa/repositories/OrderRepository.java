package com.aula.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.jpa.entities.Order;

/* 
 * Repositório JPA para acessar a camada de dados;
 * Implementação padrão já é executada pelo propio framework JPA;
 * */

public interface OrderRepository extends JpaRepository<Order, Long>{

}
