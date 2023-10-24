package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Aluno.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno,Long>{
    
}
