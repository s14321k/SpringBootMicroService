package com.sarathUniversity.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}


/*
    CREATE TABLE `address` (
        `id` int NOT NULL AUTO_INCREMENT,
        `street` varchar(100) NOT NULL,
        `city` varchar(45) NOT NULL,
        PRIMARY KEY (`id`)
        )

    desc address;
*/