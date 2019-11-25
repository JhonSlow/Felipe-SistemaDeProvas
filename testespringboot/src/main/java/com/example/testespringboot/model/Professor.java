package com.example.testespringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TB_PROFESSOR")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String rp;
    private String nome;
    private String materia;

    @Column(name = "DATA_NASCIMENTO")
    private String data;


    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getMateria() {
        return materia;
    }
    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getRp() {
        return rp;
    }
    public void setRa(String rp) {
        this.rp = rp;
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
        return "Professor [rp=" + rp + ", nome=" + nome + ", data=" + data + "materia=" + "materia ]";
    }



}