package com.codegymdanang.casestudy.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Entity
@Table(name = "Khachhang")
public class FuramaKhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "idKhachHang")
    private Long id;

    @Column(name = "idloaikhach")
    private Long idLoaiKhach;

    @Column(name = "hoten")
    @NotEmpty(message = "nhap gia tri")
    private String hoTen;

    @Column(name = "ngaysinh")
    private Date ngaySinh;

    @Column(name = "socmnd")
    private String CMND;

    @Column(name = "sdt")
    private String sdt;

    @Column(name = "email")
    private String email;

    @Column(name = "diachi")
    private String diachi;

    public FuramaKhachHang() {
    }

    public FuramaKhachHang(Long idLoaiKhach, String hoTen, Date ngaySinh, String CMND, String sdt, String email, String diachi) {
        this.idLoaiKhach = idLoaiKhach;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.CMND = CMND;
        this.sdt = sdt;
        this.email = email;
        this.diachi = diachi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdLoaiKhach() {
        return idLoaiKhach;
    }

    public void setIdLoaiKhach(Long idLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
}
