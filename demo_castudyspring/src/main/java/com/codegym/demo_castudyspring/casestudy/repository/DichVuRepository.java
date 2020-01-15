package com.codegym.demo_castudyspring.casestudy.repository;

import com.codegym.demo_castudyspring.casestudy.entity.FuramaDichVu;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DichVuRepository extends PagingAndSortingRepository<FuramaDichVu,Long> {

    Iterable<FuramaDichVu> findAllByChiPhiThueBetween(Integer fromPrice, Integer toPrice);
}
