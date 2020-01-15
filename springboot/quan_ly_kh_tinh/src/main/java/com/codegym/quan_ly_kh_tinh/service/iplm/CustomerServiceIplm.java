package com.codegym.quan_ly_kh_tinh.service.iplm;

import com.codegym.quan_ly_kh_tinh.model.Customer;
import com.codegym.quan_ly_kh_tinh.repository.CustomerRepository;
import com.codegym.quan_ly_kh_tinh.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceIplm implements CustomerService {
@Autowired
//= new CustomerRepository(gọi phương thức thì khong cần tạo đối tượng)
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.getAll();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
customerRepository.remove(id);
    }


}
