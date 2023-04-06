package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Education;
import com.portfolio.portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService implements IEducationService{

    @Autowired
    private EducationRepository eduRepo;

    @Override
    public List<Education> getEducation(){
        return eduRepo.findAll();
    }
    @Override
    public void addEducation(Education edu){
        eduRepo.save(edu);
    }
    @Override
    public void deleteEducation(Long id){
        eduRepo.deleteById(id);
    }
    @Override
    public Education findEducation(Long id) {
        return eduRepo.findById(id).orElse(null);
    }
}