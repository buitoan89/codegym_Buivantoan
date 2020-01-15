package com.example.demo_qlkh_dung_restfull.service;

import com.example.demo_qlkh_dung_restfull.model.Customer;

public interface CustomerService {
Iterable<Customer> findAll();
Customer findById(Long id);
void save(Customer customer);
void remove(Long id);
}
