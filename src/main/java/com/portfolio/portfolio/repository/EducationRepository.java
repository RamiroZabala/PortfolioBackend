package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolio.model.Education;

//@Repository No es necesario ya que JpaRepository reconoce automaticamente esta interface como repositorio
public interface EducationRepository extends JpaRepository <Education, Long> {
    
}
