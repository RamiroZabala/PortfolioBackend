package com.portfolio.portfolio.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity

public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private String lastname;
    private String birthdate;
    private String nationality;
    private String email;
    private String facebook_id;
    private String twitter_id;
    private String instagram_id;
    private String phone;
    private String title;
    @Column(length = 500)
    private String long_description;
    private String short_description;
    private String img_banner;
    private String img_profile;
 
    public Persona() {}

    public Persona(
    Long id,
    String name,
    String lastname,
    String birthdate,
    String nationality,
    String email,
    String facebook_id,
    String twitter_id,
    String instagram_id,
    String phone,
    String title,
    String long_description,
    String short_description,
    String img_banner,
    String img_profile){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.nationality = nationality;
        this.email = email;
        this.facebook_id = facebook_id;
        this.twitter_id = twitter_id;
        this.instagram_id = instagram_id;
        this.phone = phone;
        this.title = title;
        this.img_banner = img_banner;
        this.img_profile = img_profile;
    }
}
/*
 * 
{
    "id": "1",
    "name": "Ramiro",
    "lastname": "Zabala",
    "birthdate": "24/07/1987",
    "nationality": "Argentino",
    "location": "Rosario, Santa Fe",
    "email": "ramirozabala5@gmail.com",
    "facebook_id":"100009462435183",
    "twitter_id":"RamiroZabala17",
    "instagram_id":"RamiroZabala17",
    "phone":"+54 9 3412-178-186",
    "title": "Full Stack Developer Jr, Graphic Designer",
    "long_description": "Durante la última década, he estado perfeccionando mis habilidades de diseño y programación creando productos para la web, diseños de logotipos y, más recientemente, colecciones NFTs. Me esfuerzo por crear soluciones elegantes que sorprendan y deleiten a los usuarios, teniendo en cuenta las dependencias técnicas complejas para la implementación y la escalabilidad.",
    "short_description": "Bla bla bla bla bla, completar texto aqui...",
    "img_banner": "http://drive.google.com/uc?export=view&id=1VUiD15BgNgSrk6xR2KMWcYAot5rBM9EO",
    "img_profile": "http://drive.google.com/uc?export=view&id=1VUiD15BgNgSrk6xR2KMWcYAot5rBM9EO"
}
 * 
*/