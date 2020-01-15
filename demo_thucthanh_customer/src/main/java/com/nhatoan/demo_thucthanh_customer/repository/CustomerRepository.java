package com.nhatoan.demo_thucthanh_customer.repository;

import com.nhatoan.demo_thucthanh_customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer ,Long> {
    Page<Customer> findAllByFirstname(String firstname,Pageable pageable);
}
