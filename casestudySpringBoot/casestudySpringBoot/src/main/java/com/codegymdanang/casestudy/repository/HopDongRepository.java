package com.codegymdanang.casestudy.repository;

import com.codegymdanang.casestudy.entity.FuramaHopDong;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HopDongRepository extends PagingAndSortingRepository<FuramaHopDong, Long> {

    Iterable<FuramaHopDong> findAllByIdKhachHang(Long id);
}
