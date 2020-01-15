package com.example.demo_crud.ripository;

import com.example.demo_crud.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRipository extends PagingAndSortingRepository<Customer,Long> {
    Page<Customer>findAllByNameCustomer(String nameCustomer, Pageable pageable);
}
