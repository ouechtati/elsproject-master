package com.test.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Table
@Entity(name="Client")
public class Client {
    @Id
    @GeneratedValue
    @Column(name = "idClient")
    private int idClient;

    @Column(name="nom")
    private  String nom;

    @Column(name="email")
    private String email ;


    @Column(name="nationalite")
    private String nationalite;


    @ManyToMany
    @JoinTable( name = "possede",
            joinColumns = @JoinColumn( name = "idClient" ),
            inverseJoinColumns = @JoinColumn( name = "idDestination" ) )
    private List<Destination> destinations = new ArrayList<>();


    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getId() {
        return idClient;
    }

    public void setId(int id) {
        this.idClient = idClient;
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

    public Client(int idClient) {
        this.idClient = idClient;
    }

    public Client() {
        super();

    }
}
