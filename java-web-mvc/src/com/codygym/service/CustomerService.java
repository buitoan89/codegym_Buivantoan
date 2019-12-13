package com.codygym.service;

import com.codygym.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int Id);

    void update(int Id,Customer customer);

    void remove(int Id);

}
