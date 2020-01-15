package com.example.demo_thuc_hanh_springboot.service.iplm;

import com.example.demo_thuc_hanh_springboot.model.Customer;
import com.example.demo_thuc_hanh_springboot.ripository.CustomerRepository;
import com.example.demo_thuc_hanh_springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIplm implements CustomerService {
@Autowired
    CustomerRepository customerRepository;
    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
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
