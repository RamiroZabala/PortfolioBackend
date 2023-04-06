package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.HardSkill;
import java.util.List;


public interface IHardSkillService {
    public List<HardSkill> getSkill ();
    public void addSkill (HardSkill hskill);
    public void deleteSkill (Long id);
    public HardSkill findSkill(Long id);
}
