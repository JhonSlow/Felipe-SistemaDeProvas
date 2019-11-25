package com.example.testespringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.testespringboot.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, String> {
	 Aluno findById(long id);
}
