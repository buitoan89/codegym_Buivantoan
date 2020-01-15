package com.example.demo_qlkh_dung_restfull.service.iplm;

import com.example.demo_qlkh_dung_restfull.model.Customer;
import com.example.demo_qlkh_dung_restfull.repository.CustomerRepository;
import com.example.demo_qlkh_dung_restfull.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIplm implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.deleteById(id);
    }
}
