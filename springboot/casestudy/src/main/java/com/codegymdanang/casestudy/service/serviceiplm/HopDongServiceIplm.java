package com.codegymdanang.casestudy.service.serviceiplm;

import com.codegymdanang.casestudy.entity.FuramaDichvu;
import com.codegymdanang.casestudy.entity.FuramaHopDong;
import com.codegymdanang.casestudy.repository.HopDongRepository;
import com.codegymdanang.casestudy.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HopDongServiceIplm implements HopDongService {
    @Autowired
     HopDongRepository hopDongRepository;

    @Override
    public Iterable<FuramaHopDong> getAllHopDong() {
        return hopDongRepository.findAll();
    }

    @Override
    public FuramaHopDong getHopDong(Long idHopDong) {
        return hopDongRepository.findById(idHopDong).orElse(null);
    }

    @Override
    public void saveHopDong(FuramaHopDong hopDong) {
        hopDongRepository.save(hopDong);
    }

    @Override
    public void deleteHopDong(Long idHopDong) {
        hopDongRepository.deleteById(idHopDong);
    }

    @Override
    public Iterable<FuramaHopDong> findAllByIdKhachHang(Long id) {
        return hopDongRepository.findAllByIdKhachHang(id);
    }
}
