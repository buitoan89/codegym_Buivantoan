package com.codegym.baithiketthucmodule.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "quocgia")
public class Quocgia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idquocgia")
    private Long idquocgia;

    @Column(name = "tenquocgia")
    private String quocgia;

    @OneToMany(targetEntity = ThanhPho.class)
    private List<ThanhPho> thanhPhos;

    public Quocgia() {
    }

    public Quocgia(String quocgia, List<ThanhPho> thanhPhos) {
        this.quocgia = quocgia;
        this.thanhPhos = thanhPhos;
    }

    public Long getIdquocgia() {
        return idquocgia;
    }

    public void setIdquocgia(Long idquocgia) {
        this.idquocgia = idquocgia;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public List<ThanhPho> getThanhPhos() {
        return thanhPhos;
    }

    public void setThanhPhos(List<ThanhPho> thanhPhos) {
        this.thanhPhos = thanhPhos;
    }
}
