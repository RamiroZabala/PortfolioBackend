package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.SoftSkill;

import java.util.List;


public interface ISoftSkillService {
    public List<SoftSkill> getSkill ();
    public void addSkill (SoftSkill hskill);
    public void deleteSkill (Long id);
    public SoftSkill findSkill(Long id);
}
