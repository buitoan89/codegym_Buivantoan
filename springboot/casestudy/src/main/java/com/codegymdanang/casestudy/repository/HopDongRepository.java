package com.codegymdanang.casestudy.repository;

import com.codegymdanang.casestudy.entity.FuramaHopDong;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HopDongRepository extends PagingAndSortingRepository<FuramaHopDong,Long> {
    Iterable<FuramaHopDong> findAllByIdKhachHang(Long id);

}
