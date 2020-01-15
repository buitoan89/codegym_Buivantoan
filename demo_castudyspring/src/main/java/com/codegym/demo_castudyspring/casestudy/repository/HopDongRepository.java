package com.codegym.demo_castudyspring.casestudy.repository;

import com.codegym.demo_castudyspring.casestudy.entity.FuramaHopDong;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HopDongRepository extends PagingAndSortingRepository<FuramaHopDong, Long> {

    Iterable<FuramaHopDong> findAllByIdKhachHang(Long id);
}
