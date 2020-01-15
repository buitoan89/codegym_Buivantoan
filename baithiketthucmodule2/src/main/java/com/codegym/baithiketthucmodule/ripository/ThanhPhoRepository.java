package com.codegym.baithiketthucmodule.ripository;

import com.codegym.baithiketthucmodule.model.ThanhPho;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThanhPhoRepository extends PagingAndSortingRepository<ThanhPho,Long> {
}
