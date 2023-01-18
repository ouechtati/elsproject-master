package com.test.model;

import javax.persistence.*;
import java.io.Serializable;

@Table
@Entity(name="Client")
public class Client  implements Serializable
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name="nom")
    private  String nom;

    @Column(name="email")
    private String email ;


    @Column(name="nationalite")
    private String nationalite;
    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Client(int id) {
        this.id = id;
    }

    public Client() {
        super();

    }
}
