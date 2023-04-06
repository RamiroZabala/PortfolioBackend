package com.portfolio.portfolio.controller;
//IMPORTS
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//MODELS
import com.portfolio.portfolio.model.Persona;
import com.portfolio.portfolio.model.HardSkill;
import com.portfolio.portfolio.model.SoftSkill;
import com.portfolio.portfolio.model.Education;
import com.portfolio.portfolio.model.WorkProject;
//SERVICES
import com.portfolio.portfolio.service.IEducationService;
import com.portfolio.portfolio.service.IPersonaService;
import com.portfolio.portfolio.service.ISoftSkillService;
import com.portfolio.portfolio.service.IWorkProjectService;
import com.portfolio.portfolio.service.IHardSkillService;

@RestController
@RequestMapping("/api")
public class Controller {
    //================================================================================================================
    //= PERSONA ======================================================================================================
    @Autowired
    private IPersonaService persoServ;

    @PostMapping ("/new/person")
    public void agregarPersona (@RequestBody Persona pers){
        persoServ.crearPersona(pers);
    }

    @GetMapping ("/get/person")
    @ResponseBody
    public List<Persona> verPersonas (){
        return persoServ.verPersonas();
    }

    @DeleteMapping ("/delete/person/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }

    //================================================================================================================
    //= EDUCACION ====================================================================================================
    @Autowired
    private IEducationService eduServ;

    @PostMapping ("/new/education")
    public void addEducation (@RequestBody Education edu){
        eduServ.addEducation(edu);
    }

    @GetMapping ("/get/education")
    @ResponseBody
    public List<Education> getEducation(){
        return eduServ.getEducation();
    }

    @DeleteMapping ("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id){
        eduServ.deleteEducation(id);
    }

    //================================================================================================================
    //= HARD SKILLS ==================================================================================================
    @Autowired
    private IHardSkillService skillServ;

    @PostMapping ("/new/hardskill")
    public void addHardSkill (@RequestBody HardSkill skill){
        skillServ.addSkill(skill);
    }
    @PostMapping("/new/hardskill_list")
    public void addHardSkill (@RequestBody List<HardSkill> skills) {
        for (int i = 0; i < skills.size(); i++) {
            HardSkill skill = skills.get(i);
            skillServ.addSkill(skill);
        }
    }

    @GetMapping ("/get/hardskill")
    @ResponseBody
    public List<HardSkill> getHardSkill(){
        return (List<HardSkill>) skillServ.getSkill();
    }
   
    @DeleteMapping ("/delete/hardskill/{id}")
    public void deleteHardSkill(@PathVariable Long id){
        skillServ.deleteSkill(id);
    }
    
    //================================================================================================================
    //= SOFT SKILLS ==================================================================================================
    @Autowired
    private ISoftSkillService skillServ2;

    @PostMapping ("/new/softskill")
    public void addSoftSkill (@RequestBody SoftSkill skill){
        skillServ2.addSkill(skill);
    }
    @PostMapping("/new/softskill_list")
    public void addSoftSkill (@RequestBody List<SoftSkill> skills) {
        for (int i = 0; i < skills.size(); i++) {
            SoftSkill skill = skills.get(i);
            skillServ2.addSkill(skill);
        }
    }

    @GetMapping ("/get/softskill")
    @ResponseBody
    public List<SoftSkill> getSoftSkill(){
        return (List<SoftSkill>) skillServ2.getSkill();
    }

    @DeleteMapping ("/delete/softskill/{id}")
    public void deleteSoftSkill(@PathVariable Long id){
        skillServ2.deleteSkill(id);
    }
    //================================================================================================================
    //= WORK PROJECTS ================================================================================================
    @Autowired
    private IWorkProjectService wpServ;

    @PostMapping ("/new/workproject")
    public void addWorkProject (@RequestBody WorkProject wp){
        wpServ.addWorkProject(wp);
    }

    @GetMapping ("/get/workprojects")
    @ResponseBody
    public List<WorkProject> getWorkProjects(){
        return wpServ.getWorkProjects();
    }

    @DeleteMapping ("/delete/workproject/{id}")
    public void deleteWorkProject(@PathVariable Long id){
        wpServ.deleteWorkProject(id);
    }

}
