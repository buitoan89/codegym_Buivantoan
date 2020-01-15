package com.nhatoan.demo_thucthanh_customer.service;

import com.nhatoan.demo_thucthanh_customer.model.Customer;
import com.nhatoan.demo_thucthanh_customer.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProvinceService {
    Iterable<Province> findAll();
    Province findById(Long id);
    void save(Province province);
    void remove(Long id);
}
