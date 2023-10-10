package com.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="Destination")
public class Destination implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name="destination")
    private String destination;

    @Column(name="pays")
    private String pays;

    @Column(name="ville")
    private String Ville;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Client client;

    public Destination(String destination, String pays, String ville, Client client) {
        this.destination = destination;
        this.pays = pays;
        Ville = ville;
        this.client = client;
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

    public Client getClient() {
        return client;
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

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destination that = (Destination) o;
        return Objects.equals(destination, that.destination) && Objects.equals(pays, that.pays) && Objects.equals(Ville, that.Ville) && Objects.equals(client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, pays, Ville, client);
    }

    @Override
    public String toString() {
        return "Destination{" +
                "destination='" + destination + '\'' +
                ", pays='" + pays + '\'' +
                ", Ville='" + Ville + '\'' +
                ", client=" + client +
                '}';
    }

    public Destination(String destination) {
        this.destination = destination;
    }

    public Destination(Client client) {
        this.client = client;
    }

    public Destination() {
    }
}

