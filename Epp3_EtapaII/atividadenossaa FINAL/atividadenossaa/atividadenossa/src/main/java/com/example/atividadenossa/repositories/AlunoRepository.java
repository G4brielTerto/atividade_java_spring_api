package com.example.atividadenossa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.atividadenossa.entidades.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
}
