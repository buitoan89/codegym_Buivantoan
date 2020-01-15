package com.codegym.demo_castudyspring.casestudy.service;

import com.codegym.demo_castudyspring.casestudy.entity.FuramaHopDong;

import java.util.List;

public interface HopDongService {
    public  Iterable<FuramaHopDong> getAllHopDong();

    public FuramaHopDong getHopDong(Long IdHopDong);

    public void saveHopDong(FuramaHopDong hopDong);

    public void deleteHopDong(Long idHopDong);

    Iterable<FuramaHopDong> findAllByIdKhachHang(Long id);
}
