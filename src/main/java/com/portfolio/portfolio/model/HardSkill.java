package com.portfolio.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "hardskills")

public class HardSkill extends Skill{

    public HardSkill() {
    }
    public HardSkill(Long id, String skillname, Long value, String category) {
        super(id, skillname, value, category);
    }
}
/*
[
    {
        "is":1,
        "skillname":"HTML5",
        "category":"Frontend",
        "value":95
    },
    {
        "is":2,
        "skillname":"Javascript / Typescript",
        "category":"Frontend",
        "value":90
    },
    {
        "is":3,
        "skillname":"CSS3",
        "category":"Frontend",
        "value":95
    },
    {
        "is":4,
        "skillname":"PHP",
        "category":"Backend",
        "value":90
    },

    {
        "is":5,
        "skillname":"MySQL",
        "category":"Backend",
        "value":75
    },
    {
        "is":6,
        "skillname":"Photoshop",
        "category":"Others",
        "value":85
    },
    {
        "is":7,
        "skillname":"Graficos Vectoriales",
        "category":"Others",
        "value":90
    },
    {
        "is":8,
        "skillname":"Modelado y renderizado 3D",
        "category":"Others",
        "value":75
    },
    {
        "is":9,
        "skillname":"Game Dev",
        "category":"Others",
        "value":60
    }
]
*/