package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class WorkProject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String title;
    private String description;
    private String period;
    private String img;
    private String url;
 
    public WorkProject() {}

    public WorkProject(
    Long id,
    String title,
    String description,
    String period,
    String img,
    String url){
        this.id = id;
        this.title = title;
        this.description = description;
        this.period = period;
        this.img = img;
        this.url = url;
    }
}
/*
{
    "id":"1",
    "title":"Portfolio Web App",
    "description":"Trabajo final integrador del curso YoProgramo 4ta Edición (INTI)",
    "period":"2023",
    "img":"http://drive.google.com/uc?export=view&id=1INQMITUY7_Au6XqtY0fzLAf7B9NPRYzt",
    "url":"http://localhost:4200/"
}
*/