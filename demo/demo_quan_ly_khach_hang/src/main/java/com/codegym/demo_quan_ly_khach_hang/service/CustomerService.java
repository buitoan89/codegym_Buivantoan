package com.codegym.demo_quan_ly_khach_hang.service;

import com.codegym.demo_quan_ly_khach_hang.model.Customer;

import java.util.List;

public interface CustomerService {
     List<Customer> findAll();

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);
}
