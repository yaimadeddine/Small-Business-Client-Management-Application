package com.example.backend.bean;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String communicationPreferences;
    private Date registrationDate;
    private String comment;
    @ManyToOne
    private ActivityArea activityArea;
    @OneToOne //@OneToOne(cascade = CascadeType.ALL)
    private SocialMediaInfo socialMediaInfo;
    @OneToMany(mappedBy = "customer")
    private List<Interaction> interactions = new ArrayList<>();
    @OneToMany(mappedBy = "customer")
    private List<Transaction> transactions = new ArrayList<>();

}
