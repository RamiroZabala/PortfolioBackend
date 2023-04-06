package com.portfolio.portfolio.service;
import com.portfolio.portfolio.model.HardSkill;
import com.portfolio.portfolio.repository.HardSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements IHardSkillService{

    @Autowired
    private HardSkillRepository skillRepo;

    @Override
    public List<HardSkill> getSkill(){
        return skillRepo.findAll();
    }
    @Override
    public void addSkill(HardSkill hskill){
        skillRepo.save(hskill);
    }
    @Override
    public void deleteSkill(Long id){
        skillRepo.deleteById(id);
    }
    @Override
    public HardSkill findSkill(Long id) {
        return skillRepo.findById(id).orElse(null);
    }
}