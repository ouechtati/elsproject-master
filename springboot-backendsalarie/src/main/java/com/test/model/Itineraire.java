package com.test.model;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity(name="Itineraire")
public class Itineraire implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="libelle")
    private String libelle;


    @Column(name="carcterstique")
    private String carcterstique;


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

    public String getCarcterstique() {
        return carcterstique;
    }

    public void setCarcterstique(String carcterstique) {
        this.carcterstique = carcterstique;
    }
}
