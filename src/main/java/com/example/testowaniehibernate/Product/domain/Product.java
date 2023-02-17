package com.example.testowaniehibernate.Product.domain;

import com.example.testowaniehibernate.Order.domain.Order;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "produktyy")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nazwaProduktu;


}
