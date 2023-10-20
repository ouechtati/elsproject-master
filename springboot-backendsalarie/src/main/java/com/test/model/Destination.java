package com.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="Destination")
public class Destination implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "idDestination")
    private int idDestination;

    @Column(name="destination")
    private String destination;

    @Column(name="pays")
    private String pays;

    @Column(name="ville")
    private String Ville;

    @ManyToMany
    @JoinTable( name = "possede",
            joinColumns = @JoinColumn( name = "idDestination" ),
            inverseJoinColumns = @JoinColumn( name = "idClient" ) )
    private List<Client> client = new ArrayList<>();

    public Destination(String destination, String pays, String ville, Client client) {
        this.destination = destination;
        this.pays = pays;
        Ville = ville;
    }

    public String getDestination() {
        return destination;
    }

    public String getPays() {
        return pays;
    }

    public String getVille() {
        return Ville;
    }


    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setVille(String ville) {
        Ville = ville;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return Objects.equals(destination, that.destination) && Objects.equals(pays, that.pays) && Objects.equals(Ville, that.Ville);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, pays, Ville);
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destination='" + destination + '\'' +
                ", pays='" + pays + '\'' +
                ", Ville='" + Ville + '\'' +
                '}';
    }

    public Destination(String destination) {
        this.destination = destination;
    }



    public Destination() {
    }
}

