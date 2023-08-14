package com.example.backend.bean;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Interaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private Date interactionDate;
    private String interactionType;
    private String interactionDetails;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}