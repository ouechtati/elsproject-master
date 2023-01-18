package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
@Table
@Entity(name="GuidePapier")
public class GuidePapier  extends  Guide implements Serializable {


    @Column(name="id")
    private int id;

    @Column(name="libelle")
    private String libelle;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNom() {
        return libelle;
    }

    @Override
    public void setNom(String nom) {
        this.libelle = nom;
    }
}
