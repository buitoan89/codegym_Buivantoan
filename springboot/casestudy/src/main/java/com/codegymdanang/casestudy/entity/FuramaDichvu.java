package com.codegymdanang.casestudy.entity;


import javax.persistence.*;

@Entity
@Table(name = "dichvu")
public class FuramaDichvu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "tendichvu")
    private String tendichvu;

    @Column(name = "dientich")
    private int dientich;

    @Column(name = "sotang")
    private int sotang;

    @Column(name = "songuoitoida")
    private  int songuoitoida;

    @Column(name = "chiphithue")
    private int chiphithue;

    @Column(name = "trangthai")
    private String trangthai;

    @Column(name = "kieuthue_id")
    private int kieuthue_id;

    @ManyToOne
    @JoinColumn(name = "loaidichvu_id")
    private FuramaLoaiDichVu furamaLoaiDichVu;

    public FuramaDichvu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTendichvu() {
        return tendichvu;
    }

    public void setTendichvu(String tendichvu) {
        this.tendichvu = tendichvu;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    public int getSotang() {
        return sotang;
    }

    public void setSotang(int sotang) {
        this.sotang = sotang;
    }

    public int getSonguoitoida() {
        return songuoitoida;
    }

    public void setSonguoitoida(int songuoitoida) {
        this.songuoitoida = songuoitoida;
    }

    public int getChiphithue() {
        return chiphithue;
    }

    public void setChiphithue(int chiphithue) {
        this.chiphithue = chiphithue;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public int getKieuthue_id() {
        return kieuthue_id;
    }

    public void setKieuthue_id(int kieuthue_id) {
        this.kieuthue_id = kieuthue_id;
    }

    public FuramaLoaiDichVu getFuramaLoaiDichVu() {
        return furamaLoaiDichVu;
    }

    public void setFuramaLoaiDichVu(FuramaLoaiDichVu furamaLoaiDichVu) {
        this.furamaLoaiDichVu = furamaLoaiDichVu;
    }
}
