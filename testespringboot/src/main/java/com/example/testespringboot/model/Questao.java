package com.example.testespringboot.model;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TB_QUESTAO")
public class Questao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String enunciado;
	private String alternativa_a;
	private String alternativa_b;
	private String alternativa_c;
	private String alternativa_d;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getAlternativa_a() {
		return alternativa_a;
	}
	public void setAlternativa_a(String alternativa_a) {
		this.alternativa_a = alternativa_a;
	}
	public String getAlternativa_b() {
		return alternativa_b;
	}
	public void setAlternativa_b(String alternativa_b) {
		this.alternativa_b = alternativa_b;
	}
	public String getAlternativa_c() {
		return alternativa_c;
	}
	public void setAlternativa_c(String alternativa_c) {
		this.alternativa_c = alternativa_c;
	}
	public String getAlternativa_d() {
		return alternativa_d;
	}
	public void setAlternativa_d(String alternativa_d) {
		this.alternativa_d = alternativa_d;
	}
	@Override
	public String toString() {
		return "Questao [id=" + id + ", enunciado=" + enunciado + ", alternativa_a=" + alternativa_a
				+ ", alternativa_b=" + alternativa_b + ", alternativa_c=" + alternativa_c + ", alternativa_d="
				+ alternativa_d + "]";
	}
	
	
	
	

}
