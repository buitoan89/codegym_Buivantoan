package com.codegymdanang.casestudy.service.serviceiplm;

import com.codegymdanang.casestudy.entity.FuramaDichvu;
import com.codegymdanang.casestudy.repository.DichVuRepository;
import com.codegymdanang.casestudy.service.DichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DichVuServiceIplm implements DichVuService {
    @Autowired
    DichVuRepository dichVuRepository;
    @Override
    public Iterable<FuramaDichvu> getAllDichVu() {
        return dichVuRepository.findAll();
    }

    @Override
//    public Optional<FuramaDichvu> getDichVu(Long idDichVu) {
//        return Optional.empty();
//    }
    public FuramaDichvu getDichVu(Long idDichVu) {
        return dichVuRepository.findById(idDichVu).orElse(null);
    }
    @Override
    public void saveDichVu(FuramaDichvu dichvu) {
    dichVuRepository.save(dichvu);
    }

    @Override
    public void deleteDichvu(Long idDichVu) {
    dichVuRepository.deleteById(idDichVu);
    }

    @Override
    public Iterable<FuramaDichvu> findAllByChiphithueBetween(Integer fromPrice, Integer toPrice) {
        return dichVuRepository.findAllByChiphithueBetween(fromPrice, toPrice);
    }
}
