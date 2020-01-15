package com.example.demo_thuc_hanh_springboot.model;

import org.jboss.jandex.PrimitiveType;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private int age;
    private String ranger;

    @ManyToOne
    @JoinColumn(name = "provice_id")
    private Provice provice;

    public Customer() {
    }

    public Customer(String firstname, String lastname, int age, String ranger, Provice provice) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.ranger = ranger;
        this.provice = provice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRanger() {
        return ranger;
    }

    public void setRanger(String ranger) {
        this.ranger = ranger;
    }

    public Provice getProvice() {
        return provice;
    }

    public void setProvice(Provice provice) {
        this.provice = provice;
    }
}
