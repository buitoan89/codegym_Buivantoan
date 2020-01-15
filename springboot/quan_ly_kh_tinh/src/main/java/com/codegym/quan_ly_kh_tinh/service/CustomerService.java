package com.codegym.quan_ly_kh_tinh.service;

import com.codegym.quan_ly_kh_tinh.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Long id);

    void remove(Long id);

}
