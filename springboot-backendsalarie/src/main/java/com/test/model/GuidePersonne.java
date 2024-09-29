package com.test.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("GuidePersonne")
public class GuidePersonne  extends Guide{

     private long idGuidePersonne;

     private String nomGuidePersonne;


    protected GuidePersonne(Long id, String nom, String specialite, long idGuidePersonne, String nomGuidePersonne) {
        super(id, nom, specialite);
        this.idGuidePersonne = idGuidePersonne;
        this.nomGuidePersonne = nomGuidePersonne;
    }
}
