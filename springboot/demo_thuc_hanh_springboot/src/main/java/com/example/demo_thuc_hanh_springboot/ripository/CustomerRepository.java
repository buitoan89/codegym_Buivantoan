package com.example.demo_thuc_hanh_springboot.ripository;

import com.example.demo_thuc_hanh_springboot.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
