package com.example.testespringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.testespringboot.model.Aluno;
import com.example.testespringboot.repository.AlunoRepository;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoRepository ar;

	@RequestMapping(value="/cadastroAluno", method=RequestMethod.GET)
	public String form() {
		return "formAluno";
	}
	
	@RequestMapping(value="/cadastroAluno",method=RequestMethod.POST)
	public String form(Aluno aluno){
		ar.save(aluno);
		return "formAluno";
	}
	
	@RequestMapping("/alunos")
	public ModelAndView listaAluno() {
		ModelAndView mv = new ModelAndView("listaAluno");
		Iterable<Aluno> alunos = ar.findAll();
		mv.addObject("alunos", alunos);
		return mv;
	}
	
	@RequestMapping("/deletarAluno")
	public String deletarAluno(long id) {
		Aluno aluno = ar.findById(id);
		ar.delete(aluno);
		return "redirect:/alunos";
	}
	
}
