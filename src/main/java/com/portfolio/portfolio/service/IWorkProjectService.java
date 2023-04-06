package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.WorkProject;
import java.util.List;


public interface IWorkProjectService {
    public List<WorkProject> getWorkProjects ();
    public void addWorkProject (WorkProject wp);
    public void deleteWorkProject (Long id);
    public WorkProject findWorkProject(Long id);
}
