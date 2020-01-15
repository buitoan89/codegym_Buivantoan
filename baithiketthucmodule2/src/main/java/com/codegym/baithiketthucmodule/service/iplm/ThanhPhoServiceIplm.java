package com.codegym.baithiketthucmodule.service.iplm;

import com.codegym.baithiketthucmodule.model.ThanhPho;
import com.codegym.baithiketthucmodule.ripository.ThanhPhoRepository;
import com.codegym.baithiketthucmodule.service.ThanhPhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ThanhPhoServiceIplm implements ThanhPhoService {
    @Autowired
    ThanhPhoRepository thanhPhoRepository;

    @Override
    public Page<ThanhPho> findAll(Pageable pageable) {
        return thanhPhoRepository.findAll(pageable);
    }

    @Override
    public ThanhPho findById(Long id) {
        return thanhPhoRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ThanhPho thanhPho) {
        thanhPhoRepository.save(thanhPho);
    }

    @Override
    public void remove(Long id) {
        thanhPhoRepository.deleteById(id);
    }
}
