package com.example.testespringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.testespringboot.model.Professor;
import com.example.testespringboot.repository.ProfessorRepository;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository pr;

    @RequestMapping(value ="/cadastroProfessor", method=RequestMethod.GET)
    public String form() {
        return "formProfessor";
    }

    @RequestMapping(value ="/cadastroProfessor",method=RequestMethod.POST)
    public String form(Professor professor){
        pr.save(professor);
        return "formProfessor";
    }

    @RequestMapping("/professores")
    public ModelAndView listaProfessor() {
        ModelAndView mv = new ModelAndView("listaProfessor");
        Iterable<Professor> professores = pr.findAll();
        mv.addObject("professores", professores);
        return mv;
    }

    @RequestMapping("/deletarProfessor")
    public String deletarProfessor(long id) {
        Professor professor = pr.findById(id);
        pr.delete(professor);
        return "redirect:/professores";
    }

}