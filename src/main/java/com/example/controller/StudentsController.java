package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Students;
import com.example.service.StudentsService;

@RestController
public class StudentsController {

	@Autowired
	StudentsService studentsService;

	@GetMapping("/student")
	private List<Students> getAllStudents() {
		return studentsService.getAllStudents();
	}

	@GetMapping("/student/{sid}")
	private Students getstudents(@PathVariable("sid") int sid) {
		return studentsService.getStudentsById(sid);
	}

	@DeleteMapping("/student/{sid}")
	private void deleteBook(@PathVariable("sid") int sid) {
		studentsService.delete(sid);
	}

	@PostMapping("/student")
	private int saveStudent(@RequestBody Students students) {
		studentsService.saveOrUpdate(students);
		return students.getSid();
	}

	@PutMapping("/students")
	private Students update(@RequestBody Students students) {
		studentsService.saveOrUpdate(students);
		return students;
	}
}
