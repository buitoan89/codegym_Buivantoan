package com.example.demo_thuchanhcopy.service;


import com.example.demo_thuchanhcopy.model.Country;

public interface CountryService {
    Iterable<Country> findAll();

    Country findById(Long id);

    void save(Country country);

    void remove(Long id);
}
