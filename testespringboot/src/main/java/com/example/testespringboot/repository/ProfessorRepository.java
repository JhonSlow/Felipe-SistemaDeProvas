package com.example.testespringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.testespringboot.model.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, String> {
     Professor findById(long id);
}