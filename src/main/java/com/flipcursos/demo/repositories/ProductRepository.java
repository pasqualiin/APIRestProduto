package com.flipcursos.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flipcursos.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
