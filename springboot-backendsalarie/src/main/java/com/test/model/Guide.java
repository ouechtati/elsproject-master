package com.test.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="Guide")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Guide implements Serializable {


    @Id
    @GeneratedValue
    private int id;

    @Column(name="nom")
    private String nom;

    @Column(name="specialite")
    private String specialite;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }




}
