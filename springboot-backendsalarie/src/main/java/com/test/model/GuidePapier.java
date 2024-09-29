package com.test.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("GuidePapier")
public class GuidePapier  extends Guide{

     private Long idGuidepapier;

     private String LibelleGuidepapier;

    protected GuidePapier(Long id, String nom, String specialite, Long idGuidepapier, String libelleGuidepapier) {
        super(id, nom, specialite);
        this.idGuidepapier = idGuidepapier;
        LibelleGuidepapier = libelleGuidepapier;
    }
}
