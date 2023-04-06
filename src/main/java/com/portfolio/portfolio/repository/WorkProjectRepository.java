package com.portfolio.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.portfolio.model.WorkProject;

//@Repository
public interface WorkProjectRepository extends JpaRepository <WorkProject, Long> {
    
}
