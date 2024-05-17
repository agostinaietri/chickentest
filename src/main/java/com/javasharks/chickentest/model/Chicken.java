package com.javasharks.chickentest.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Generated;
import lombok.ToString;

import java.math.BigDecimal;

@Entity
@Data
@Table(name="chicken")
@ToString
public class Chicken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Price is mandatory")
    private BigDecimal price;

}
