package com.codegymdanang.casestudy.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "hopdong")
public class FuramaHopDong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhopdong")
    private Long idHopDong;

    @Column(name = "idnhanvien")
    private Long idNhanVien;

    @Column(name = "idkhachhang")
    private Long idKhachHang;

    @Column(name = "iddichvu")
    private Long iddichvu;

    @Column(name = "ngaylamhopdong")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ngayLamHopDong;

    @Column(name = "ngayketthuc")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date ngayKetThuc;

    @Column(name = "tiendatcoc")
    private double tienDatcoc;

    @Column(name = "tongtien")
    private double tongTien;

    public FuramaHopDong() {
    }

    public FuramaHopDong(Long idNhanVien, Long idKhachHang, Long iddichvu, Date ngayLamHopDong, Date ngayKetThuc, double tienDatcoc, double tongTien) {
        this.idNhanVien = idNhanVien;
        this.idKhachHang = idKhachHang;
        this.iddichvu = iddichvu;
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
        this.tienDatcoc = tienDatcoc;
        this.tongTien = tongTien;
    }

    public Long getIddichvu() {
        return iddichvu;
    }

    public void setIddichvu(Long iddichvu) {
        this.iddichvu = iddichvu;
    }

    public Long getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(Long idHopDong) {
        this.idHopDong = idHopDong;
    }

    public Long getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Long idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public Long getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(Long idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public Date getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(Date ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public double getTienDatcoc() {
        return tienDatcoc;
    }

    public void setTienDatcoc(double tienDatcoc) {
        this.tienDatcoc = tienDatcoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
