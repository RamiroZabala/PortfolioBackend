package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.WorkProject;
import com.portfolio.portfolio.repository.WorkProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkProjectService implements IWorkProjectService{

    @Autowired
    private WorkProjectRepository wpRepo;

    @Override
    public List<WorkProject> getWorkProjects(){
        return wpRepo.findAll();
    }
    @Override
    public void addWorkProject(WorkProject wp){
        wpRepo.save(wp);
    }
    @Override
    public void deleteWorkProject(Long id){
        wpRepo.deleteById(id);
    }
    @Override
    public WorkProject findWorkProject(Long id) {
        return wpRepo.findById(id).orElse(null);
    }
}