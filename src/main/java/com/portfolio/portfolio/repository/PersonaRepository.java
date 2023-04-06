package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolio.model.Persona;

//@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long> {
    
}
