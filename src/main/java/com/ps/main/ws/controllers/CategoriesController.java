package com.ps.main.ws.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ps.main.ws.categoryclass.CategoriesRepository;
import com.ps.main.ws.categoryclass.Category;

@RestController
@CrossOrigin(origins = "*")
public class CategoriesController {
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	//Fetch categories
	@GetMapping("/categories")
	public List<Category> getCategories() {
		return (List<Category>) categoriesRepository.findAll();
	}

}
