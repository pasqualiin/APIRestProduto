package com.flipcursos.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipcursos.demo.entities.Department;
import com.flipcursos.demo.entities.Product;

@RestController
@RequestMapping(value = "/products")

public class ProductController {

	@GetMapping
	public List<Product> getObjects() {
		Department department1 = new Department(1L, "Tech");
		Department department2 = new Department(2L, "Pet");

		Product product1 = new Product(1L, "Macbook Pro", 4000.0, department1);
		Product product2 = new Product(2L, "PC Gamer", 5000.0, department1);
		Product product3 = new Product(3L, "Pet House", 300.0, department2);

		List<Product> list = Arrays.asList(product1, product2, product3);

		return list;
	}
}
