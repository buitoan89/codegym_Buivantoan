package com.example.demo_crud.service.ipml;

import com.example.demo_crud.model.Customer;
import com.example.demo_crud.ripository.CustomerRipository;
import com.example.demo_crud.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIplm implements CustomerService {

    @Autowired
    CustomerRipository customerRipository;

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRipository.findAll(pageable);
    }

    @Override
    public Customer findById(Long idCustomer) {
        return customerRipository.findById(idCustomer).orElse(null);
    }

    @Override
    public void save(Customer customer) {
        customerRipository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRipository.deleteById(id);
    }

    @Override
    public Page<Customer> findAllByNameCustomer(String nameCustomer, Pageable pageable) {
        return customerRipository.findAllByNameCustomer(nameCustomer,pageable);
    }

}
