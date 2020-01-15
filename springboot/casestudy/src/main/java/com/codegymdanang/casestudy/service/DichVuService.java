package com.codegymdanang.casestudy.service;

import com.codegymdanang.casestudy.entity.FuramaDichvu;

import java.nio.file.OpenOption;
import java.util.Optional;

public interface DichVuService {
    public Iterable<FuramaDichvu> getAllDichVu();
   // public Optional<FuramaDichvu> getDichVu(Long idDichVu);
    public FuramaDichvu getDichVu(Long idDichVu);
    public void saveDichVu(FuramaDichvu dichvu);
    public void deleteDichvu(Long idDichVu);
    public Iterable<FuramaDichvu> findAllByChiphithueBetween(Integer fromPrice, Integer toPrice);

}
