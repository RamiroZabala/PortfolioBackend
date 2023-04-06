package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String title;
    private String description;
    private String period;
    private String img_icon;
 
    public Education() {}

    public Education(
    Long id,
    String title,
    String description,
    String period,
    String img_icon){
        this.id = id;
        this.title = title;
        this.description = description;
        this.period = period;
        this.img_icon = img_icon;
    }
}
/*
{
    "id":"1",
    "title":"Programador Web Full Stack Jr",
    "description":"YoProgramo 4ta Edición (INTI)",
    "period":"2022 - En curso",
    "img_icon":"http://drive.google.com/uc?export=view&id=1VBGsH_DQxuzrXncc0vmFjmwdvAuo41-k"
},
{
    "id":"2",
    "title":"Secundario",
    "description":"Escuela de enseñanza media Nº436 - Juan Mantovani",
    "period":"2000 - 2005",
    "img_icon":"http://drive.google.com/uc?export=view&id=1u8_owYrBjfupu9suem6xoZwtgPozuXK2"
}
*/