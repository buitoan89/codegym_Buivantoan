package com.nhatoan.demo_thucthanh_customer.repository;

import com.nhatoan.demo_thucthanh_customer.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends PagingAndSortingRepository<Province, Long> {

}
