package com.codegymdanang.casestudy.repository;

import com.codegymdanang.casestudy.entity.FuramaDichvu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DichVuRepository extends PagingAndSortingRepository<FuramaDichvu, Long> {
Iterable<FuramaDichvu> findAllByChiphithueBetween(Integer fromPrice, Integer toPrice);
}
