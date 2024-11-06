package com.test.model;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name="SiteTouristiques")
public class SiteTouristiques implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="libelle")
    private String libelle;

    @Column(name="zone")
    private String zone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
