package com.generation.guardaroupas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.guardaroupas.model.GuardaRoupa;

@Repository // Apenas por boas Praticas
public interface GuardaRoupasRepository extends JpaRepository<GuardaRoupa, Long>{

}
