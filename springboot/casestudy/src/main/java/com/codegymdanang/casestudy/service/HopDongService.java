package com.codegymdanang.casestudy.service;


import com.codegymdanang.casestudy.entity.FuramaHopDong;

public interface HopDongService {
    public Iterable<FuramaHopDong> getAllHopDong();
    public FuramaHopDong getHopDong(Long idHopDong);
    public void saveHopDong(FuramaHopDong hopDong);
    public void deleteHopDong(Long idHopDong);
    Iterable<FuramaHopDong> findAllByIdKhachHang(Long id);
}
