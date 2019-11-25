package com.example.testespringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TB_ALUNO")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String ra;
	private String nome;
	
	@Column(name = "DATA_NASCIMENTO")
	private String data;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	 
	public String toString() {
		return "Aluno [ra=" + ra + ", nome=" + nome + ", data=" + data + "]";
	}
	
	
	
}
