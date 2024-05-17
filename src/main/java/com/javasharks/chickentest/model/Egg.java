package com.javasharks.chickentest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

import java.time.Instant;
import java.util.Date;

@Entity
@Data
@Table(name="egg")
@ToString
public class Egg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Price is mandatory")
    private double price;
    /*
    private int daysOld;
    Egg() {
        Date date = new Date();
        date.getTime();
        daysOld = date.getDay();
    }
    */
}