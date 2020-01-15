package com.codegymdanang.casestudy.service;
import com.codegymdanang.casestudy.entity.FuramaKhachHang;

public interface KhachHangService {
    public Iterable<FuramaKhachHang> getAllKhachHang();
    public FuramaKhachHang getKhachhang(Long idKhachHang);
    public void saveKhachHang(FuramaKhachHang khachHang);
    public void deleteKhachHang(Long idKhachHang);
}
