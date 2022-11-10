package com.manCh007.java.databaseinteraction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manCh007.java.databaseinteraction.model.Student;
import com.manCh007.java.databaseinteraction.repository.StudentRepository;

@RestController
@RequestMapping("/dbWithJpa")
public class FirstController {
	
	@Autowired
	private StudentRepository repository;
	
	@GetMapping("/getAllStudent")
	public List<Student> getAllStudent() {
		return repository.findAll();
	}

}
