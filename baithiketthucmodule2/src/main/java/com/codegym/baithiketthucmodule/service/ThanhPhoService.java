package com.codegym.baithiketthucmodule.service;

import com.codegym.baithiketthucmodule.model.ThanhPho;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ThanhPhoService {
    Page<ThanhPho> findAll(Pageable pageable);

    ThanhPho findById(Long id);

    void save(ThanhPho thanhPho);

    void remove(Long id);
}
