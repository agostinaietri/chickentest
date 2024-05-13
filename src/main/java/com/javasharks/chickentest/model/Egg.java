package com.javasharks.chickentest.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="egg")
public class Egg {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double price;

}