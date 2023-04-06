package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "softskills")

public class SoftSkill extends Skill{

    public SoftSkill() {
    }
    public SoftSkill(Long id, String skillname, Long value, String category) {
        super(id, skillname, value, category);
    }
}
/*
[
    {
        "id":1,
        "skillname":"Comunicación",
        "category":"Soft",
        "value":100
    },
    {
        "id":2,
        "skillname":"Trabajo en Equipo",
        "category":"Soft",
        "value":50
    },
    {
        "id":3,
        "skillname":"Solucion de Problemas",
        "category":"Soft",
        "value":90
    },
    {
        "id":4,
        "skillname":"Organizacion",
        "category":"Soft",
        "value":100
    },
    {
        "id":5,
        "skillname":"Creatividad",
        "category":"Soft",
        "value":85
    },
    {
        "id":6,
        "skillname":"Inglés Técnico",
        "category":"Language",
        "value":90
    },
    {
        "id":7,
        "skillname":"Inglés, Lectura y Escritura",
        "category":"Language",
        "value":85
    },
    {
        "id":8,
        "skillname":"Inglés Oral",
        "category":"Language",
        "value":65
    }
]
*/