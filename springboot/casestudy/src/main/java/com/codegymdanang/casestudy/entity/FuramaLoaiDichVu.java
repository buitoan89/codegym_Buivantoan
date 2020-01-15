package com.codegymdanang.casestudy.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaidichvu")
public class FuramaLoaiDichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tendichvu")
    private String tendichvu;
    @OneToMany(targetEntity = FuramaDichvu.class)
    private List<FuramaDichvu> furamaDichvus;

    public FuramaLoaiDichVu() {
    }

    public FuramaLoaiDichVu(String tendichvu, List<FuramaDichvu> furamaDichvus) {
        this.tendichvu = tendichvu;
        this.furamaDichvus = furamaDichvus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public List<FuramaDichvu> getFuramaDichvus() {
        return furamaDichvus;
    }

    public void setFuramaDichvus(List<FuramaDichvu> furamaDichvus) {
        this.furamaDichvus = furamaDichvus;
    }
}
