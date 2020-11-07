package com.example.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Students;
import com.example.repository.StudentsRepository;

@Service
public class StudentsService {
	@Autowired
	StudentsRepository studentsRepository;

	public List<Students> getAllStudents() {
		List<Students> students = new ArrayList<Students>();
		studentsRepository.findAll().forEach(students1 -> students.add(students1));
		return students;
	}

	public Students getStudentsById(int sid) {
		return studentsRepository.findById(sid).get();
	}

	public void saveOrUpdate(Students students) {
		studentsRepository.save(students);
	}

	public void delete(int id) {
		studentsRepository.deleteById(id);
	}

//updating a record
	public void update(Students students, int sid) {
		studentsRepository.save(students);
	}
}