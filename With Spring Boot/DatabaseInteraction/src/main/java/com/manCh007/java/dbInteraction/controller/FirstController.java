package com.manCh007.java.dbInteraction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manCh007.java.dbInteraction.model.Student;

@RestController
@RequestMapping("/dbInteraction")
public class FirstController {
	
	@Autowired
//	@Qualifier("sqlJdbcTemplate")
	private NamedParameterJdbcTemplate template;

	@GetMapping("/getAllMySQL")
	public List<Student> getAllStudent() {
		return template.query("select * from student", (rs, rowNum) -> {
			Student student = new Student();
			student.setId(rs.getInt("student_id"));
			student.setName(rs.getString("student_name"));
			return student;
		});
	}
}
