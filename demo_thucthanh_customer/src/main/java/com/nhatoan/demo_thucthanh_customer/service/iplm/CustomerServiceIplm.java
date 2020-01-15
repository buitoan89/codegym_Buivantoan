package com.nhatoan.demo_thucthanh_customer.service.iplm;

import com.nhatoan.demo_thucthanh_customer.model.Customer;
import com.nhatoan.demo_thucthanh_customer.repository.CustomerRepository;
import com.nhatoan.demo_thucthanh_customer.service.CustomerService;
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

    @Override
    public Page<Customer> findAllByFirstname(String firstname, Pageable pageable) {
        return customerRepository.findAllByFirstname(firstname,pageable);
    }

//    @Override
//    public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
//        return customerRepository.findAllByFirstNameContaining(firstname, pageable);
//    }
}
