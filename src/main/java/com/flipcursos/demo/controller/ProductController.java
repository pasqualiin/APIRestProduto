package com.flipcursos.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipcursos.demo.entities.Department;
import com.flipcursos.demo.entities.Product;
import com.flipcursos.demo.repositories.ProductRepository;

@RestController
@RequestMapping(value = "/products")

public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping
	public List<Product> getObjects() {

		List<Product> list = productRepository.findAll();

		return list;
	}
}
