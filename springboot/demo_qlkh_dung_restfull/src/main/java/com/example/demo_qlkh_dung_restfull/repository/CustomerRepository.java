package com.example.demo_qlkh_dung_restfull.repository;

import com.example.demo_qlkh_dung_restfull.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}
