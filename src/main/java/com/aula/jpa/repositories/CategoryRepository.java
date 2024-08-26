package com.aula.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aula.jpa.entities.Category;

/* 
 * Repositório JPA para acessar a camada de dados;
 * Implementação padrão já é executada pelo propio framework JPA;
 * */

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
