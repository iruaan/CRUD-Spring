package com.example.demo.Aluno;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private BigDecimal notaPrimeiroSemestre;
    private BigDecimal notaSegundoSemestre;
    private String nomeProfessor;
    private int numeroSala;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public BigDecimal getNotaPrimeiroSemestre() {
        return notaPrimeiroSemestre;
    }
    public void setNotaPrimeiroSemestre(BigDecimal notaPrimeiroSemestre) {
        this.notaPrimeiroSemestre = notaPrimeiroSemestre;
    }
    public BigDecimal getNotaSegundoSemestre() {
        return notaSegundoSemestre;
    }
    public void setNotaSegundoSemestre(BigDecimal notaSegundoSemestre) {
        this.notaSegundoSemestre = notaSegundoSemestre;
    }
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    public int getNumeroSala() {
        return numeroSala;
    }
    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    
}
