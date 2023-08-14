package com.example.backend.bean;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    private Date transactionDate;
    private double amountSpent;
    private String paymentStatus;

    @OneToMany(mappedBy = "transaction")
    private List<TransactionItem> transactionItems = new ArrayList<>();


}
