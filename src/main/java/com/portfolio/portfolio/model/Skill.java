package com.portfolio.portfolio.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Inheritance;
//import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass

public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String skillname;
    private Long value;
    private String category;
 
    public Skill() {}

    public Skill(
    Long id,
    String skillname,
    Long value,
    String category){
        this.id = id;
        this.skillname = skillname;
        this.value = value;
        this.category = category;
    }
}