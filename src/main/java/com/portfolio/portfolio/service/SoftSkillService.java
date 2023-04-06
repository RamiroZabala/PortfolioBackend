package com.portfolio.portfolio.service;
import com.portfolio.portfolio.model.SoftSkill;
import com.portfolio.portfolio.repository.SoftSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillService implements ISoftSkillService{

    @Autowired
    private SoftSkillRepository skillRepo;

    @Override
    public List<SoftSkill> getSkill(){
        return skillRepo.findAll();
    }
    @Override
    public void addSkill(SoftSkill skill){
        skillRepo.save(skill);
    }
    @Override
    public void deleteSkill(Long id){
        skillRepo.deleteById(id);
    }
    @Override
    public SoftSkill findSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
}