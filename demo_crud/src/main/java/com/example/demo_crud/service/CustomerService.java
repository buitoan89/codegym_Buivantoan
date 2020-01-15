package com.example.demo_crud.service;

import com.example.demo_crud.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    Customer findById(Long idCustomer);
    void save(Customer customer);
    void remove(Long id);
    Page<Customer>findAllByNameCustomer(String nameCustomer, Pageable pageable);
}
