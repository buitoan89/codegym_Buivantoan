package com.codegym.demo_castudyspring.casestudy.service;

import com.codegym.demo_castudyspring.casestudy.entity.FuramaKhachHang;


public interface KhachHangService {
        public  Iterable<FuramaKhachHang> getAllKhachHang();

        public FuramaKhachHang getKhachHang(Long IdKhachHang);

        public void saveKhachHang(FuramaKhachHang khachHang);

        public void deleteKhachHang(Long idKhachHang);


}
