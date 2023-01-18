package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="Destination")
public class Destination implements Serializable {

    @Id
    @Column(name="destination")
    private String destination;

    @Column(name="pays")
    private String pays;

    @Column(name="ville")
    private String Ville;



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




    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }



}
