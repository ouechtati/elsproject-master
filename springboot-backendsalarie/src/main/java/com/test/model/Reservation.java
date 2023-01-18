package com.test.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable {


    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;

    @Column(name="datereservation")
    private Date datereservation;

    @Column(name="heure_reservation")
    private String heure_reservation;

    @Column(name="duree_reservation")
    private String duree_reservation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDatereservation() {
        return datereservation;
    }

    public void setDatereservation(Date datereservation) {
        this.datereservation = datereservation;
    }

    public String getHeure_reservation() {
        return heure_reservation;
    }

    public void setHeure_reservation(String heure_reservation) {
        this.heure_reservation = heure_reservation;
    }

    public String getDuree_reservation() {
        return duree_reservation;
    }

    public void setDuree_reservation(String duree_reservation) {
        this.duree_reservation = duree_reservation;
    }
}
