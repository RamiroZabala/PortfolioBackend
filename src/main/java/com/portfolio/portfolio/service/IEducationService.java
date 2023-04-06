package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.Education;
import java.util.List;


public interface IEducationService {
    public List<Education> getEducation ();
    public void addEducation (Education per);
    public void deleteEducation (Long id);
    public Education findEducation(Long id);
}
