package com.nhatoan.demo_thucthanh_customer.service;

import com.nhatoan.demo_thucthanh_customer.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService  {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(Long id);
    void save(Customer customer);
    void remove(Long id);
 //   Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
 Page<Customer> findAllByFirstname(String firstname,Pageable pageable);
}
