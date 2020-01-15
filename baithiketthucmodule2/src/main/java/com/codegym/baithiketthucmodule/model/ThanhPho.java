package com.codegym.baithiketthucmodule.model;

import javax.persistence.*;

@Entity
@Table(name = "Thanhpho")
public class ThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenthanhpho")
    private String tenThanhPho;

    @Column(name = "dientich")
    private int dienTich;

    @Column(name = "danso")
    private double danSo;

    @Column(name = "GDP")
    private long GDP;

    @Column(name = "mota")
    private String moTa;

    @ManyToOne
    @JoinColumn(name = "quocgia_id")
    private Quocgia quocgia;

    public Quocgia getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(Quocgia quocgia) {
        this.quocgia = quocgia;
    }

    public ThanhPho() {
    }

    public ThanhPho(String tenThanhPho, int dienTich, double danSo, long GDP, String moTa) {
        this.tenThanhPho = tenThanhPho;
        this.dienTich = dienTich;
        this.danSo = danSo;
        this.GDP = GDP;
        this.moTa = moTa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public double getDanSo() {
        return danSo;
    }

    public void setDanSo(double danSo) {
        this.danSo = danSo;
    }

    public long getGDP() {
        return GDP;
    }

    public void setGDP(long GDP) {
        this.GDP = GDP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
