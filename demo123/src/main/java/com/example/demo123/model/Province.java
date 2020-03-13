package com.example.demo123.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Province {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> cities;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCities() {
        return cities;
    }

    public void setCities(List<Customer> cities) {
        this.cities = cities;
    }
}