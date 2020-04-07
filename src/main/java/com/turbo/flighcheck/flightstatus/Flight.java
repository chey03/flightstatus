package com.turbo.flighcheck.flightstatus;


import com.sun.javafx.beans.IDProperty;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.sql.Time;
import java.text.SimpleDateFormat;
//import java.util.Date;

@Entity

public class Flight {

    //SimpleDateFormat sdf =  new SimpleDateFormat("HH:mm:ss" );
    //String time = sdf.format (  yourDate  );
    //String t

    private Integer id;
    private Integer number;
    private String airline;
    private String departure_time;
    private String arrival_time;
    private String price;

    public Flight() {
    }

    public Flight(Integer id, Integer number, String airline, String departure_time, String arrival_time, String price) {
        this.id = id;
        this.number = number;
        this.airline = airline;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.price = price;
    }
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
