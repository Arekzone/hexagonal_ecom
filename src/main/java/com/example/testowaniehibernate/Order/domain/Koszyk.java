package com.example.testowaniehibernate.Order.domain;

import com.example.testowaniehibernate.Order.domain.Order;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Koszyk{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @PrePersist
    void onCreate() {
        this.createdAt = new Date();
    }
    public Koszyk(){

    }


}
