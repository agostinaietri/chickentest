package com.javasharks.chickentest.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="farm")
public class Farm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int cattle;

}
