package com.example.demo_thuchanhcopy.repository;


import com.example.demo_thuchanhcopy.model.Country;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends PagingAndSortingRepository<Country, Long> {
}
