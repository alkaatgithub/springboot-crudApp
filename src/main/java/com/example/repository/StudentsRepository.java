package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.model.Students;

public interface StudentsRepository extends CrudRepository<Students, Integer> {
}
